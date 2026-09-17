package com.telusko.SpringEcom.Model.DTO;

public record OrderItemRequest(
        int productId,
        int quantity
) {
}
