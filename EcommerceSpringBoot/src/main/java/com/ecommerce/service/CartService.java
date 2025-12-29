package com.ecommerce.service;

import com.ecommerce.dto.AddToCartRequest;
import com.ecommerce.entity.CartItem;
import com.ecommerce.entity.Product;
import com.ecommerce.entity.User;
import com.ecommerce.repository.CartItemRepository;
import com.ecommerce.repository.ProductRepository;
import com.ecommerce.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.Optional;

@Service
public class CartService {
  private final CartItemRepository cartRepo;
  private final ProductRepository productRepo;
  private final UserRepository userRepo;

  public CartService(CartItemRepository cartRepo, ProductRepository productRepo, UserRepository userRepo) {
    this.cartRepo = cartRepo;
    this.productRepo = productRepo;
    this.userRepo = userRepo;
  }

  public List<CartItem> getCart(Long userId) {
    return cartRepo.findByUserId(userId);
  }

  @Transactional
  public CartItem addToCart(Long userId, AddToCartRequest req) {
    User user = userRepo.findById(userId)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));
    Product product = productRepo.findById(req.getProductId())
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found"));

    Optional<CartItem> existing = cartRepo.findByUserIdAndProductId(userId, product.getId());

    CartItem item = existing.orElseGet(() -> {
      CartItem ci = new CartItem();
      ci.setUser(user);
      ci.setProduct(product);
      ci.setQuantity(0);
      return ci;
    });

    int newQty = item.getQuantity() + req.getQuantity();
    if (newQty < 1) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Quantity must be >= 1");
    }
    if (newQty > product.getStock()) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Not enough stock");
    }

    item.setQuantity(newQty);
    return cartRepo.save(item);
  }

  @Transactional
  public CartItem updateQuantity(Long cartItemId, int qty) {
    CartItem item = cartRepo.findById(cartItemId)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CartItem not found"));
    if (qty <= 0) {
      cartRepo.deleteById(cartItemId);
      throw new ResponseStatusException(HttpStatus.NO_CONTENT, "Item removed");
    }
    if (qty > item.getProduct().getStock()) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Not enough stock");
    }
    item.setQuantity(qty);
    return cartRepo.save(item);
  }

  public void removeItem(Long cartItemId) {
    cartRepo.deleteById(cartItemId);
  }

  public void clearCart(Long userId) {
    cartRepo.deleteByUserId(userId);
  }

  public double cartTotal(Long userId) {
    return getCart(userId).stream()
        .mapToDouble(ci -> ci.getProduct().getPrice() * ci.getQuantity())
        .sum();
  }
}
