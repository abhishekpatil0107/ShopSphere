import { Link, useNavigate } from "react-router-dom";
import { useContext } from "react";
import { CartContext } from "../context/CartContext";
import { useUser } from "../context/useUser";
import { api } from "../api/client";

export default function Header() {
  const { cart } = useContext(CartContext);
  const { user, setUser } = useUser();
  const nav = useNavigate();

  const handleLogout = async () => {
    try {
      await api("/api/auth/logout", { method: "POST" });
    } catch (e) {
      console.error("Logout failed", e);
    }
    // 🔹 Clear user from context (UserProvider will sync with localStorage)
    setUser(null);
    nav("/login");
  };

  return (
    <header className="bg-blue-700 text-white p-4 shadow-md sticky top-0 z-50">
      <div className="container mx-auto flex justify-between items-center">
        <Link to="/" className="text-2xl font-bold tracking-wide">
          AP Mart
        </Link>

        <nav className="flex gap-6 items-center">
          <Link to="/" className="hover:underline">
            Home
          </Link>
          <Link to="/cart" className="hover:underline">
            Cart ({cart.length})
          </Link>
          <Link to="/checkout" className="hover:underline">
            Checkout
          </Link>

          {user ? (
            <>
              <span className="italic">Welcome, {user.name}</span>
              <button
                onClick={handleLogout}
                className="bg-red-500 hover:bg-red-600 px-3 py-1 rounded"
              >
                Logout
              </button>
            </>
          ) : (
            <>
              <Link to="/login" className="hover:underline">
                Login
              </Link>
              <Link to="/register" className="hover:underline">
                Register
              </Link>
            </>
          )}
        </nav>
      </div>
    </header>
  );
}
