import { useContext } from "react";
import { CartContext } from "../context/CartContext";
import CartItem from "./CartItem";

export default function CartContent() {
  const { cart, clearCart } = useContext(CartContext);

  return (
    <div className="p-4">
      {cart.length === 0 ? (
        <p className="text-gray-600">Your cart is empty.</p>
      ) : (
        <>
          <div className="space-y-4 max-h-64 overflow-y-auto">
            {cart.map((item) => (
              <CartItem key={item.id} item={item} />
            ))}
          </div>
          <button
            onClick={clearCart}
            className="mt-4 w-full bg-red-600 text-white py-2 rounded hover:bg-red-700 transition"
          >
            Clear Cart
          </button>
        </>
      )}
    </div>
  );
}
