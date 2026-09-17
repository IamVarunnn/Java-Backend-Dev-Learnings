package com.telusko.SpringEcom.Service;

import com.telusko.SpringEcom.Model.DTO.OrderRequest;
import com.telusko.SpringEcom.Model.DTO.OrderResponse;
import com.telusko.SpringEcom.Model.Order;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Service
public class OrderService {
    public OrderResponse placeOrder(OrderRequest orderRequest) {
        Order order = new Order();
        String orderId = "ORD" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        order.setOrderId(orderId);
        order.setCustomerName(orderRequest.customerName());
        order.setEmail(orderRequest.email());
        order.setStatus("PLACED");
        order.setOrderDate(LocalDate.now());

        return null;
    }

    public List<OrderResponse> getAllOrderResponses() {
        return null;
    }
}
