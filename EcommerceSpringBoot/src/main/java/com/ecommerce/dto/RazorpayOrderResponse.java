package com.ecommerce.dto;

public class RazorpayOrderResponse {
    private String id;            // Razorpay order id
    private int amount;           // in paise
    private String currency;      // e.g., "INR"
    private Long localOrderId;    // DB order id we created

    public RazorpayOrderResponse(String id, int amount, String currency, Long localOrderId) {
        this.id = id;
        this.amount = amount;
        this.currency = currency;
        this.localOrderId = localOrderId;
    }

    public String getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public Long getLocalOrderId() {
        return localOrderId;
    }
}
