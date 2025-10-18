import { useContext } from "react";
import { CartContext } from "../context/CartContext";

export default function CartItem({ item }) {
  const { removeFromCart, updateQty } = useContext(CartContext);

  return (
    <div className="flex items-center justify-between border-b py-4 transition duration-300 hover:bg-purple-50 rounded-lg px-2">
      <img
        src={item.image}
        alt={item.name}
        className="w-20 h-20 object-cover rounded shadow-md transform transition hover:scale-105"
      />
      <div className="flex-1 ml-4">
        <h2 className="font-bold text-lg text-purple-700">{item.name}</h2>
        <p className="text-gray-800 font-semibold">₹{item.price}</p>
        <input
          type="number"
          value={item.qty}
          min={1}
          onChange={(e) => updateQty(item.id, parseInt(e.target.value))}
          className="border rounded w-16 mt-1 p-1 focus:ring-2 focus:ring-purple-400"
        />
      </div>
      <button
        onClick={() => removeFromCart(item.id)}
        className="bg-red-600 text-white px-3 py-1 rounded hover:bg-red-700 transition duration-300"
      >
        Remove
      </button>
    </div>
  );
}
