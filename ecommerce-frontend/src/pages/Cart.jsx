import { useCart } from "../context/CartContext";
import { useNavigate, Link } from "react-router-dom";
import { useUser } from "../context/useUser";

export default function Cart() {
  const { cart, updateQuantity, removeFromCart } = useCart();
  const { user } = useUser();
  const navigate = useNavigate();

  // redirect if not logged in
  if (!user) {
    navigate("/login");
    return null;
  }

  const total = cart.reduce(
    (sum, item) => sum + item.price * item.quantity,
    0
  );

  if (cart.length === 0) {
    return (
      <div className="p-8 text-center">
        <h2 className="text-2xl font-semibold">Your cart is empty 🛒</h2>
        <Link
          to="/"
          className="mt-4 inline-block px-4 py-2 bg-blue-600 text-white rounded-lg"
        >
          Shop Now
        </Link>
      </div>
    );
  }

  return (
    <div className="p-6 max-w-5xl mx-auto">
      <h2 className="text-2xl font-bold mb-6">Shopping Cart</h2>
      <div className="space-y-4">
        {cart.map((item) => (
          <div
            key={item.id}
            className="flex items-center gap-4 bg-white p-4 rounded-lg shadow"
          >
            {/* Product Image */}
            <div className="w-[300px] h-[300px] flex items-center justify-center bg-gray-100 rounded-lg overflow-hidden">
              <img
                src={item.image}
                alt={item.title}
                className="w-full h-full object-contain"
              />
            </div>

            {/* Product Info */}
            <div className="flex-1">
              <h3 className="font-semibold text-lg">{item.name}</h3>
              <p className="text-gray-600">₹{item.price}</p>

              <div className="flex items-center mt-2 gap-2">
                <button
                  onClick={() => updateQuantity(item.id, item.quantity - 1)}
                  className="px-3 py-1 bg-gray-300 rounded text-lg"
                >
                  -
                </button>
                <span className="px-3">{item.quantity}</span>
                <button
                  onClick={() => updateQuantity(item.id, item.quantity + 1)}
                  className="px-3 py-1 bg-gray-300 rounded text-lg"
                >
                  +
                </button>
              </div>
            </div>

            {/* Item Total and Remove */}
            <div className="flex flex-col items-end gap-2">
              <p className="font-bold">₹{item.price * item.quantity}</p>
              <button
                onClick={() => removeFromCart(item.id)}
                className="text-red-600 hover:underline"
              >
                Remove
              </button>
            </div>
          </div>
        ))}
      </div>

      {/* Checkout Button */}
      <div className="mt-8 flex flex-col items-center bg-white p-4 rounded-lg shadow">
        <h3 className="text-lg font-semibold mb-4">Total: ₹{total.toFixed(2)}</h3>
        <button
          onClick={() => navigate("/checkout")}
          className="px-6 py-2 bg-blue-600 text-white rounded-lg"
        >
          Checkout
        </button>
      </div>
    </div>
  );
}
