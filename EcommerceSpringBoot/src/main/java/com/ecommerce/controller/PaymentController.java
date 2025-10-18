package com.ecommerce.controller;

import com.ecommerce.dto.PaymentVerificationRequest;
import com.ecommerce.entity.Order;
import com.ecommerce.repository.OrderRepository;
import com.razorpay.RazorpayException;
import com.razorpay.Utils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Handles Razorpay payment verification.
 * - Verifies signature using Razorpay SDK Utils.
 * - Updates local order status to PAID or FAILED.
 * - Relies on global CORS config (no per-controller @CrossOrigin).
 */
@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    private final OrderRepository orderRepository;

    @Value("${razorpay.key_secret}")
    private String razorpaySecret;

    public PaymentController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @PostMapping("/verify")
    public ResponseEntity<?> verifyPayment(@RequestBody PaymentVerificationRequest body) {
        try {
            Optional<Order> orderOpt = orderRepository.findById(body.getOrderId());
            if (orderOpt.isEmpty()) {
                return ResponseEntity.badRequest().body("Order not found");
            }

            Order order = orderOpt.get();

            // Build attributes for signature verification
            JSONObject attributes = body.toJsonObject();

            boolean isSignatureValid = Utils.verifyPaymentSignature(attributes, razorpaySecret);

            if (isSignatureValid) {
                order.setStatus("PAID");
                order.setRazorpayPaymentId(body.getRazorpayPaymentId());
                orderRepository.save(order);
                return ResponseEntity.ok("Payment verified successfully");
            } else {
                order.setStatus("FAILED");
                orderRepository.save(order);
                return ResponseEntity.badRequest().body("Payment verification failed");
            }

        } catch (RazorpayException e) {
            return ResponseEntity.status(500).body("Razorpay error: " + e.getMessage());
        }
    }
}
