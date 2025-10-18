package com.ecommerce.service;

import com.ecommerce.dto.CartItemDto;
import com.ecommerce.dto.RazorpayOrderResponse;
import com.ecommerce.entity.Order;
import com.ecommerce.entity.OrderItem;
import com.ecommerce.repository.CartItemRepository;
import com.ecommerce.repository.OrderRepository;
import com.ecommerce.repository.ProductRepository;
import com.ecommerce.repository.UserRepository;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckoutService {

    private final CartItemRepository cartItemRepository;
    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;
    private final UserRepository userRepository;

    @Value("${razorpay.key_id}")
    private String razorpayKey;

    @Value("${razorpay.key_secret}")
    private String razorpaySecret;

    public CheckoutService(CartItemRepository cartItemRepository,
                           OrderRepository orderRepository,
                           ProductRepository productRepository,
                           UserRepository userRepository) {
        this.cartItemRepository = cartItemRepository;
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
        this.userRepository = userRepository;
    }

    /**
     * Creates a Razorpay order and stores local Order with OrderItems.
     *
     * @param userId    The ID of the logged-in user
     * @param cartItems Items from frontend cart
     * @return RazorpayOrderResponse with order details
     * @throws RazorpayException If Razorpay client fails
     */
    public RazorpayOrderResponse createOrder(Long userId, List<CartItemDto> cartItems) throws RazorpayException {
        if (cartItems == null || cartItems.isEmpty()) {
            throw new IllegalStateException("Cart is empty, cannot create order");
        }

        // Create local order
        Order order = new Order();
        order.setUserId(userId);
        order.setStatus("CREATED");

        double totalAmount = 0.0;

        // ✅ Loop through DTO items
        for (CartItemDto cartItem : cartItems) {
            var product = productRepository.findById(cartItem.getProductId())
                    .orElseThrow(() -> new IllegalStateException("Product not found: " + cartItem.getProductId()));

            OrderItem oi = new OrderItem();
            oi.setOrder(order);
            oi.setProductId(product.getId());
            oi.setProductName(product.getName());
            oi.setQuantity(cartItem.getQuantity());
            oi.setPrice(product.getPrice() * cartItem.getQuantity());

            order.getItems().add(oi);
            totalAmount += oi.getPrice();
        }

        if (totalAmount <= 0) {
            throw new IllegalStateException("Total amount must be greater than 0");
        }

        order.setTotal(totalAmount);
        order = orderRepository.save(order);

        // ✅ Create Razorpay order
        RazorpayClient client = new RazorpayClient(razorpayKey, razorpaySecret);
        JSONObject options = new JSONObject();
        options.put("amount", (int) Math.round(totalAmount * 100)); // amount in paise
        options.put("currency", "INR");
        options.put("receipt", "order_rcptid_" + order.getId());
        options.put("payment_capture", 1);

        com.razorpay.Order rpOrder = client.orders.create(options);

        // Save Razorpay order ID for reference
        order.setRazorpayOrderId(rpOrder.get("id"));
        orderRepository.save(order);

        return new RazorpayOrderResponse(
                rpOrder.get("id"),
                rpOrder.get("amount"),
                rpOrder.get("currency"),
                order.getId()
        );
    }
}
