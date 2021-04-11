package com.example.question_7.Controller;

import com.example.question_7.Model.Order;
import com.example.question_7.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    OrderService orderServiceImpl;

    @PostMapping(path = "/addOrder")
    public String AddOrder(@RequestBody Order order)
    {
        return orderServiceImpl.AddOrder(order);
    }
    @PostMapping(path = "/addOrder")
    public Order updateOrder(@RequestBody Order order)
    {
        return orderServiceImpl.updateOrder(order);
    }
    @PostMapping(path = "/addOrder/{orderId}")
    public Optional<Order> displayOrder(@PathVariable Integer orderId)
    {
        return orderServiceImpl.displayOrder(orderId);
    }
    @PostMapping(path = "/addOrder")
    public List<Order> displayAllOrder()
    {
        return orderServiceImpl.displayAllOrder();

    }
    @PostMapping(path = "/addOrder")
    public String deleteOrder(Integer orderId)
    {
        return orderServiceImpl.deleteOrder(orderId);
    }

}
