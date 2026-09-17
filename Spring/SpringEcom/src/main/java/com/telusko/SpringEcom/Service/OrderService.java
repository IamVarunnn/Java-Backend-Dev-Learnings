package com.telusko.SpringEcom.Service;

import com.telusko.SpringEcom.Model.DTO.OrderRequest;
import com.telusko.SpringEcom.Model.DTO.OrderResponse;
import com.telusko.SpringEcom.Model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    public OrderResponse placeOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setOrderId(orderRequest);

        return null;
    }

    public List<OrderResponse> getAllOrderResponses() {
        return null;
    }
}
