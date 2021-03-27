package com.company;

public class Orders {
    private int orderPrice = 0;
    private String orderStatus = "";

    public Orders(int orderPrice, String orderStatus) {
        this.orderPrice = orderPrice;
        this.orderStatus = orderStatus;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderPrice=" + orderPrice +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }
}

