package com.ecommerce.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import java.util.List;

public class CartRequest {

    @NotEmpty(message = "Cart items cannot be empty")
    @Valid
    private List<CartItemDto> items;

    public CartRequest() {}

    public CartRequest(List<CartItemDto> items) {
        this.items = items;
    }

    public List<CartItemDto> getItems() {
        return items;
    }

    public void setItems(List<CartItemDto> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "CartRequest{" +
                "items=" + items +
                '}';
    }
}
