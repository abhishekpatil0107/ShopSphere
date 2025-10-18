// src/components/ProductCard.jsx
import { useContext } from "react";
import { CartContext } from "../context/CartContext";

export default function ProductCard({ product }) {
  const { addToCart } = useContext(CartContext);

  // Create a standardized product object for the cart
  const handleAddToCart = () => {
    addToCart({
      id: product.id,
      name: product.name,
      price: product.price,
      image: product.image,
      quantity: 1, // default quantity
    });
  };

  return (
    <div className="bg-white shadow-md rounded-2xl p-4 flex flex-col items-center text-center 
                    hover:shadow-2xl transform hover:scale-105 transition duration-300">
      {/* Product Image */}
      <img
        src={product.image}
        alt={product.name}
        className="w-[200px] h-[200px] object-cover rounded-lg mb-4"
      />

      {/* Product Name */}
      <h3 className="text-lg font-semibold mb-1">{product.name}</h3>

      {/* Product Price */}
      <p className="text-gray-600 mb-4">₹{product.price}</p>

      {/* Add to Cart Button */}
      <button
        onClick={handleAddToCart}
        className="bg-blue-600 text-white px-4 py-2 rounded-lg hover:bg-blue-700 transition"
      >
        Add to Cart
      </button>
    </div>
  );
}
