import { useState, useEffect } from "react";
import { Link, useLocation } from "react-router-dom";
import Confetti from "react-confetti";

export default function PaymentSuccess() {
  const location = useLocation();
  const { order } = location.state || {}; // order: { id, amount, status }

  const [windowSize, setWindowSize] = useState({
    width: window.innerWidth,
    height: window.innerHeight,
  });

  // Resize confetti on window change
  useEffect(() => {
    const handleResize = () =>
      setWindowSize({ width: window.innerWidth, height: window.innerHeight });
    window.addEventListener("resize", handleResize);
    return () => window.removeEventListener("resize", handleResize);
  }, []);

  if (!order) {
    return (
      <div className="p-6 text-center">
        <h1 className="text-2xl font-bold text-red-600">No order found!</h1>
        <Link
          to="/"
          className="mt-4 inline-block px-4 py-2 bg-blue-600 text-white rounded-lg"
        >
          Go Home
        </Link>
      </div>
    );
  }

  return (
    <div className="p-6 text-center flex flex-col items-center justify-center relative min-h-screen bg-purple-50">
      {/* 🎉 Confetti Effect */}
      <Confetti
        width={windowSize.width}
        height={windowSize.height}
        recycle={false}
      />

      <h1 className="text-4xl font-bold mb-4 text-purple-700 animate-bounce">
        Payment Successful!
      </h1>
      <p className="mb-2 text-gray-700">
        Thank you for your purchase. Your order will be processed shortly.
      </p>

      <div className="mb-6 text-left bg-white p-6 rounded-lg shadow w-full max-w-md">
        <p className="mb-2 text-lg font-semibold text-green-600">
          Order ID: {order.id}
        </p>
        <p className="mb-2 text-gray-700">Status: {order.status}</p>
        <p className="mb-2 text-gray-800 font-semibold">
          Paid: ₹{order.amount.toFixed(2)}
        </p>
      </div>

      <Link
        to="/"
        className="bg-gradient-to-r from-purple-600 via-pink-500 to-red-500 text-white px-6 py-2 rounded hover:scale-105 transition transform duration-300 font-semibold"
      >
        Continue Shopping
      </Link>
    </div>
  );
}
