package com.ecommerce.controller;

import com.ecommerce.dto.ApiResponse;
import com.ecommerce.dto.RazorpayOrderResponse;
import com.ecommerce.dto.CartRequest;
import com.ecommerce.service.CheckoutService;
import com.razorpay.RazorpayException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private final CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    // ✅ Use clear endpoint name instead of {userId}
    @PostMapping("/create-order/{userId}")
    public ApiResponse<RazorpayOrderResponse> createOrder(
            @PathVariable Long userId,
            @RequestBody CartRequest cartRequest) {
        try {
            if (cartRequest == null || cartRequest.getItems().isEmpty()) {
                return ApiResponse.error("Cart is empty");
            }

            RazorpayOrderResponse order = checkoutService.createOrder(userId, cartRequest.getItems());
            return ApiResponse.success(order);

        } catch (RazorpayException e) {
            System.err.println("RazorpayException: " + e.getMessage());
            return ApiResponse.error("Failed to create Razorpay order: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            return ApiResponse.error("Error creating order: " + e.getMessage());
        }
    }
}
