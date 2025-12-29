package com.ecommerce.controller;

import com.ecommerce.dto.AddToCartRequest;
import com.ecommerce.dto.UpdateCartRequest;
import com.ecommerce.entity.CartItem;
import com.ecommerce.dto.ApiResponse;
import com.ecommerce.service.CartService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
public class CartController {
  private final CartService cartService;

  public CartController(CartService cartService) {
    this.cartService = cartService;
  }

  @GetMapping
  public List<CartItem> getCart(HttpServletRequest request) {
    Long uid = extractUserId(request);
    return cartService.getCart(uid);
  }

  @PostMapping
  public CartItem add(HttpServletRequest request, @Valid @RequestBody AddToCartRequest req){
    Long uid = extractUserId(request);
    return cartService.addToCart(uid, req);
  }

  @PutMapping
  public CartItem update(@Valid @RequestBody UpdateCartRequest req){
    return cartService.updateQuantity(req.getCartItemId(), req.getQuantity());
  }

  @DeleteMapping("/{cartItemId}")
  public ApiResponse<Void> remove(@PathVariable Long cartItemId){
    cartService.removeItem(cartItemId);
    return new ApiResponse<>(true, null, "Removed");
  }

  @DeleteMapping("/clear")
  public ApiResponse<Void> clear(HttpServletRequest request){
    Long uid = extractUserId(request);
    cartService.clearCart(uid);
    return new ApiResponse<>(true, null, "Cleared");
  }

  private Long extractUserId(HttpServletRequest request) {
    HttpSession s = request.getSession(false);
    if (s != null) {
      Object uidAttr = s.getAttribute("userId");
      if (uidAttr instanceof Long) return (Long) uidAttr;
    }
    String header = request.getHeader("X-USER-ID");
    if (header != null) return Long.valueOf(header);
    throw new IllegalStateException("Login required");
  }
}
