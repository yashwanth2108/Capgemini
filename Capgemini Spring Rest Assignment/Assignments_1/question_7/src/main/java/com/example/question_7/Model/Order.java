package com.example.question_7.Model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Orders")
public class Order {

    @Id
    private long orderId;
    private String orderName;
    private User user;
    private double orderPrice;
    private String deliveryAddress;

    public Order(long orderId,String orderName, double orderPrice , User user) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.user=user;
        this.orderPrice = orderPrice;
        this.deliveryAddress = user.getUserAddress();
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
}
