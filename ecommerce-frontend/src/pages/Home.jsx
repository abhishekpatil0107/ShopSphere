import ProductCard from "../components/ProductCard";
import camera from "../assets/products/camera.jpg";
import headphones from "../assets/products/headphones.jpg";
import laptop from "../assets/products/laptop.jpg";
import shoes from "../assets/products/shoes.jpg";
import smartphone from "../assets/products/smartphone.jpg";
import watch from "../assets/products/watch.jpg";

const products = [
  { id: 1, name: "Camera", price: 12000, image: camera },
  { id: 2, name: "Headphones", price: 3000, image: headphones },
  { id: 3, name: "Laptop", price: 55000, image: laptop },
  { id: 4, name: "Shoes", price: 2500, image: shoes },
  { id: 5, name: "Smartphone", price: 20000, image: smartphone },
  { id: 6, name: "Watch", price: 4000, image: watch },
];

export default function Home() {
  return (
    <div className="grid grid-cols-1 sm:grid-cols-2 md:grid-cols-3 gap-6 p-6">
      {products.map((product) => (
        <ProductCard key={product.id} product={product} />
      ))}
    </div>
  );
}
