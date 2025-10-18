// src/pages/Checkout.jsx
import { useCart } from "../context/CartContext";
import { useUser } from "../context/useUser";
import { useState, useEffect } from "react";
import { useNavigate } from "react-router-dom";
import { api } from "../api/client";

export default function Checkout() {
  const { cart } = useCart();
  const { user } = useUser();
  const [loading, setLoading] = useState(false);
  const navigate = useNavigate();

  // Redirect if not logged in
  useEffect(() => {
    if (!user) navigate("/login");
  }, [user, navigate]);

  if (!user) return <p>Loading user info...</p>;

  const total = cart.reduce((sum, item) => sum + item.price * item.quantity, 0);
  const invoiceNumber = Math.floor(Math.random() * 1000000);

  const handlePayment = async () => {
    if (!user?.id) {
      alert("⚠️ User data is missing an ID. Please log in again.");
      navigate("/login");
      return;
    }

    if (cart.length === 0) {
      alert("Cart is empty.");
      return;
    }

    try {
      setLoading(true);

      // ✅ Send only productId + quantity
      const body = {
        items: cart.map((item) => ({
          productId: item.id,
          quantity: item.quantity,
        })),
      };

      const rpOrder = await api(`/api/checkout/create-order/${user.id}`, {
        method: "POST",
        body: JSON.stringify(body),
      });

      if (!rpOrder?.success || !rpOrder.data)
        throw new Error("Order creation failed");

      const orderData = rpOrder.data;

      // ✅ Load Razorpay key from .env
      const RAZORPAY_KEY = import.meta.env.VITE_RAZORPAY_KEY;
      if (!RAZORPAY_KEY) {
        alert("⚠️ Razorpay key is missing. Please check your .env file.");
        setLoading(false);
        return;
      }

      const options = {
        key: RAZORPAY_KEY,
        amount: orderData.amount,
        currency: orderData.currency,
        name: "AP Mart",
        description: "Order Payment",
        order_id: orderData.id,
        handler: async (response) => {
          try {
            await api("/api/payment/verify", {
              method: "POST",
              body: JSON.stringify({
                orderId: orderData.localOrderId,
                razorpayPaymentId: response.razorpay_payment_id,
                razorpayOrderId: response.razorpay_order_id,
                razorpaySignature: response.razorpay_signature,
              }),
            });

            navigate("/payment-success", {
              state: {
                order: {
                  id: orderData.localOrderId,
                  amount: orderData.amount / 100,
                  status: "PAID",
                },
              },
            });
          } catch {
            alert("Payment verification failed");
          } finally {
            setLoading(false);
          }
        },
        prefill: {
          name: user.name || "Guest",
          email: user.email || "guest@example.com",
          contact: user.phone || "9999999999",
        },
        theme: { color: "#3399cc" },
      };

      const rzp = new window.Razorpay(options);
      rzp.on("payment.failed", (response) => {
        alert("Payment failed: " + response.error.description);
        setLoading(false);
      });
      rzp.open();
    } catch (err) {
      alert(err.message || "Payment failed");
      setLoading(false);
    }
  };

  return (
    <div className="p-6 max-w-5xl mx-auto bg-gray-50 min-h-screen">
      {/* Invoice Header */}
      <div className="bg-white p-6 rounded-lg shadow mb-6">
        <h1 className="text-3xl font-bold">AP Mart</h1>
        <p className="text-gray-600">Invoice #: {invoiceNumber}</p>
        <p className="text-gray-600">{new Date().toLocaleDateString("en-IN")}</p>
      </div>

      {/* Items Table */}
      <div className="bg-white rounded-lg shadow overflow-x-auto">
        <table className="w-full text-left border-collapse">
          <thead className="bg-gray-200">
            <tr>
              <th className="p-3 border">Product Name</th>
              <th className="p-3 border">Quantity</th>
              <th className="p-3 border">Price</th>
              <th className="p-3 border">Total</th>
            </tr>
          </thead>
          <tbody>
            {cart.length === 0 ? (
              <tr>
                <td colSpan="4" className="p-3 text-center text-gray-500">
                  No items in cart
                </td>
              </tr>
            ) : (
              cart.map((item) => (
                <tr key={item.id} className="border-b hover:bg-gray-50">
                  <td className="p-3">{item.name}</td>
                  <td className="p-3 border">{item.quantity}</td>
                  <td className="p-3 border">₹{item.price}</td>
                  <td className="p-3 border font-bold">
                    ₹{item.price * item.quantity}
                  </td>
                </tr>
              ))
            )}
          </tbody>
        </table>
      </div>

      {/* Total Section */}
      <div className="mt-6 bg-white p-6 rounded-lg shadow flex flex-col items-end">
        <h2 className="text-xl font-semibold mb-4">
          Total: ₹{total.toFixed(2)}
        </h2>
        <button
          onClick={handlePayment}
          disabled={loading || cart.length === 0}
          className="px-6 py-2 bg-blue-600 text-white rounded-lg disabled:opacity-50"
        >
          {loading ? "Processing..." : "Pay Now"}
        </button>
      </div>
    </div>
  );
}
