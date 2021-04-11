package com.example.question_7.Service;

import com.example.question_7.Model.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    public String AddOrder(Order order);

    public Order updateOrder(Order order);

    public Optional<Order> displayOrder(Integer orderId);

    public List<Order> displayAllOrder();

    public String deleteOrder(Integer orderId);
}
