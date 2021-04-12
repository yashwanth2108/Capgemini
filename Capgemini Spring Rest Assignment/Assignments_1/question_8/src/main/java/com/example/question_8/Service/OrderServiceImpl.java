package com.example.question_8.Service;


import com.example.question_8.Model.Order;
import com.example.question_8.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public String AddOrder(Order order)
    {
        orderRepository.insert(order);
        return "Order Added Successfully";
    }
    @Override
    public Order updateOrder(Order order)
    {
        return orderRepository.save(order);
    }

    @Override
    public Optional<Order> displayOrder(Long orderId)
    {
        return orderRepository.findById(orderId);
    }

    @Override
    public List<Order> displayAllOrder()
    {
        return orderRepository.findAll();

    }

    @Override
    public String deleteOrder(Long orderId)
    {
        orderRepository.deleteById(orderId);
        return "Order Deleted Successfully";
    }

}
