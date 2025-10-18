export const payWithRazorpay = async (order, navigate) => {
  const options = {
    key: "YOUR_RAZORPAY_KEY",
    amount: order.amount,
    currency: "INR",
    name: "Ecommerce Store",
    description: "Test Transaction",
    order_id: order.id,
    handler: function (response) {
      alert("Payment Successful: " + response.razorpay_payment_id);

      // Navigate with state so PaymentSuccess.jsx can access it
      navigate("/payment-success", {
        state: {
          orderId: order.id,
          amount: order.amount,
          paymentId: response.razorpay_payment_id,
        },
      });
    },
    prefill: {
      name: "Customer Name",
      email: "customer@example.com",
      contact: "9999999999",
    },
    theme: {
      color: "#2563eb",
    },
  };

  const rzp = new window.Razorpay(options);
  rzp.open();
};
