package com.ecommerce.service;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.Utils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final String keyId;
    private final String keySecret;
    private final RazorpayClient client;

    public PaymentService(@Value("${razorpay.key_id}") String keyId,
                          @Value("${razorpay.key_secret}") String keySecret) throws Exception {
        this.keyId = keyId;
        this.keySecret = keySecret;
        this.client = new RazorpayClient(keyId, keySecret);
    }

    /** Accept rupees; convert to paise inside. */
    public String createRazorpayOrder(int amountInRupees) throws Exception {
        if (amountInRupees <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
        JSONObject orderRequest = new JSONObject();
        orderRequest.put("amount", amountInRupees * 100); // convert rupees to paise
        orderRequest.put("currency", "INR");
        orderRequest.put("receipt", "rcpt_" + System.currentTimeMillis());

        Order order = client.orders.create(orderRequest); // Razorpay's Order class
        return order.toString();
    }

    /** Use Razorpay's official util to verify the signature (Base64-HMAC-SHA256). */
    public boolean verifySignature(String orderId, String paymentId, String signature) {
        try {
            JSONObject attrs = new JSONObject()
                    .put("razorpay_order_id", orderId)
                    .put("razorpay_payment_id", paymentId)
                    .put("razorpay_signature", signature);

            return Utils.verifyPaymentSignature(attrs, keySecret);
        } catch (Exception e) {
            return false;
        }
    }
}
