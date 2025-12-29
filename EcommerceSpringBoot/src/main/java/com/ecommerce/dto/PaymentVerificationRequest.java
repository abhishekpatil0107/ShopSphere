package com.ecommerce.dto;

import org.json.JSONObject;

public class PaymentVerificationRequest {
    private Long orderId; // local DB order id
    private String razorpayOrderId;
    private String razorpayPaymentId;
    private String razorpaySignature;

    public PaymentVerificationRequest() {}

    public Long getOrderId() { return orderId; }
    public void setOrderId(Long orderId) { this.orderId = orderId; }

    public String getRazorpayOrderId() { return razorpayOrderId; }
    public void setRazorpayOrderId(String razorpayOrderId) { this.razorpayOrderId = razorpayOrderId; }

    public String getRazorpayPaymentId() { return razorpayPaymentId; }
    public void setRazorpayPaymentId(String razorpayPaymentId) { this.razorpayPaymentId = razorpayPaymentId; }

    public String getRazorpaySignature() { return razorpaySignature; }
    public void setRazorpaySignature(String razorpaySignature) { this.razorpaySignature = razorpaySignature; }

    // ✅ Helper method so controller code looks clean
    public JSONObject toJsonObject() {
        JSONObject json = new JSONObject();
        json.put("razorpay_order_id", this.razorpayOrderId);
        json.put("razorpay_payment_id", this.razorpayPaymentId);
        json.put("razorpay_signature", this.razorpaySignature);
        return json;
    }
}
