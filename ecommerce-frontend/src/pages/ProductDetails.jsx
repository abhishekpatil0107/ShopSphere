import { useParams } from "react-router-dom";
import { useEffect, useState, useContext } from "react";
import { fetchProducts } from "../services/api";

import { CartContext } from "../context/CartContext";
import Loader from "../components/Loader";

export default function ProductDetails() {
  const { id } = useParams();
  const [product, setProduct] = useState(null);
  const [loading, setLoading] = useState(true);
  const { addToCart } = useContext(CartContext);

  useEffect(() => {
    fetchProducts(id).then(data => {
      setProduct(data);
      setLoading(false);
    });
  }, [id]);

  if (loading) return <Loader />;

  return (
    <div className="p-6 flex flex-col md:flex-row gap-6 max-w-6xl mx-auto">
      <img src={product.image} alt={product.name} className="w-full md:w-1/2 h-96 object-cover rounded-lg shadow-lg transform transition hover:scale-105"/>
      <div className="flex-1">
        <h1 className="text-4xl font-bold mb-4 text-purple-700">{product.name}</h1>
        <p className="text-2xl text-gray-800 mb-4 font-semibold">₹{product.price}</p>
        <p className="mb-6 text-gray-700">High-quality product. Add more description here for marketing appeal.</p>
        <button
          onClick={() => addToCart(product)}
          className="bg-gradient-to-r from-purple-600 via-pink-500 to-red-500 text-white px-6 py-2 rounded hover:scale-105 transition transform duration-300 font-semibold"
        >
          Add to Cart
        </button>
      </div>
    </div>
  );
}
