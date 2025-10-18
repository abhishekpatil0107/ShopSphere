// src/services/api.js

export async function fetchProducts() {
  // Import all product images from the folder dynamically
  const images = import.meta.glob('../assets/products/*.{png,jpg,jpeg}', { eager: true });

  // Convert images into a product array
  const products = Object.keys(images).map((path, index) => {
    const fileName = path.split('/').pop().split('.')[0]; // get name without extension
    return {
      id: index + 1,
      name: fileName.charAt(0).toUpperCase() + fileName.slice(1), // Capitalize name
      price: Math.floor(Math.random() * 90000) + 1000, // Random price for now
      image: images[path].default || images[path], // Correct way to access the image path
    };
  });

  return products;
}
