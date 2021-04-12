package com.example.question_8.Controller;

import com.example.question_8.Model.Order;
import com.example.question_8.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    OrderService orderServiceImpl;

    @PostMapping(path = "/SubmitOrder")
    public String AddOrder(@RequestBody Order order)
    {
        return orderServiceImpl.AddOrder(order);
    }

    @PostMapping(path = "/updateOrder")
    public Order updateOrder(@RequestBody Order order)
    {
        return orderServiceImpl.updateOrder(order);
    }

    @GetMapping(path = "/getOrder/{orderId}")
    public Optional<Order> displayOrder(@PathVariable Long orderId)
    {
        return orderServiceImpl.displayOrder(orderId);
    }

    @GetMapping(path = "/getOrders")
    public List<Order> displayAllOrder() { return orderServiceImpl.displayAllOrder(); }

    @GetMapping(path = "/deleteOrder/{orderId}")
    public String deleteOrder(@PathVariable Long orderId)
    {
        return orderServiceImpl.deleteOrder(orderId);
    }

}
