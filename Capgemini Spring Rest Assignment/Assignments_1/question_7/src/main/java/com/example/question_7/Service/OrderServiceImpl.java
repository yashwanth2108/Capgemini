package com.example.question_7.Service;

import com.example.question_7.Model.Order;
import com.example.question_7.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
        return "Order Deleted Successfully";
    }
    @Override
    public Order updateOrder(Order order)
    {
        return orderRepository.save(order);
    }

    @Override
    public Optional<Order> displayOrder(Integer orderId)
    {
        return orderRepository.findById(orderId);
    }

    @Override
    public List<Order> displayAllOrder()
    {
        return orderRepository.findAll();

    }

    @Override
    public String deleteOrder(Integer orderId)
    {
        orderRepository.deleteById(orderId);
        return "Order Deleted Successfully";
    }

}
