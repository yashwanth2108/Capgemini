package com.example.question_8.Service;



import com.example.question_8.Model.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    public String AddOrder(Order order);

    public Order updateOrder(Order order);

    public Optional<Order> displayOrder(Long orderId);

    public List<Order> displayAllOrder();

    public String deleteOrder(Long orderId);
}
