package com.example.question_8.Model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.List;


@Document(collection = "OrderPro")
public class Order {

    @Id
    private long orderId;
    private String orderName;
    private Customer customer;
    private double orderPrice;
    private String deliveryAddress;
    private List<LineItem> lineItems = new ArrayList<>();

    public Order(long orderId,String orderName, double orderPrice , Customer customer) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.customer = customer;
        this.orderPrice = orderPrice;
        this.deliveryAddress = customer.getcustomerAddress();
    }
    public Order()
    {

    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Customer getcustomer() {
        return customer;
    }

    public void setcustomer(Customer customer) {
        this.customer = customer;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void addLineItem(LineItem lineItem)
    {
        lineItems.add(lineItem);
    }
    public void removeLine(LineItem lineItem)
    {
        lineItems.removeIf( p -> p.getItemId() == lineItem.getItemId());
    }
    public List<LineItem> getLineItems()
    {
        return lineItems;
    }

}
