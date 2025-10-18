package com.ecommerce;

import com.ecommerce.entity.Product;
import com.ecommerce.entity.User;
import com.ecommerce.repository.ProductRepository;
import com.ecommerce.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class EcommerceSpringBootApplication {
  public static void main(String[] args) {
    SpringApplication.run(EcommerceSpringBootApplication.class, args);
  }

  @Bean
  CommandLineRunner seed(UserRepository userRepo,
                         ProductRepository productRepo,
                         PasswordEncoder passwordEncoder) {
    return args -> {
      // Seed a demo user if missing (entity has: name, email, password, role)
      if (userRepo.findByEmail("demo@example.com").isEmpty()) {
        User demo = new User();
        demo.setName("Demo User"); // ✅ Fix: add non-null name
        demo.setEmail("demo@example.com");
        demo.setPassword(passwordEncoder.encode("demo123")); // hashed
        demo.setRole("USER");
        userRepo.save(demo);
      }

      // Seed products if table is empty
      if (productRepo.count() == 0) {
        Product headphones = new Product();
        headphones.setName("Headphones");
        headphones.setDescription("Wireless headphones");
        headphones.setPrice(1999.0);
        headphones.setStock(50);
        productRepo.save(headphones);

        Product keyboard = new Product();
        keyboard.setName("Keyboard");
        keyboard.setDescription("Mechanical keyboard");
        keyboard.setPrice(2999.0);
        keyboard.setStock(30);
        productRepo.save(keyboard);

        Product mouse = new Product();
        mouse.setName("Mouse");
        mouse.setDescription("Gaming mouse");
        mouse.setPrice(1499.0);
        mouse.setStock(40);
        productRepo.save(mouse);
      }
    };
  }
}
