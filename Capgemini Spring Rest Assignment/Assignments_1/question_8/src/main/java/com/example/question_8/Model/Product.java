package com.example.question_8.Model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "products")
public class Product {

    @Id
    private int productId;
    private String productName;
    private double productPrice;
    private String deliveryAddress;

    public Product(int productId, String productName, double productPrice , String deliveryAddress) {
        this.productId = productId;
        this.productName = productName;
        // this.user = user;
        this.productPrice = productPrice;
        this.deliveryAddress = deliveryAddress;
    }

    public int getproductId() {
        return productId;
    }

    public void setproductId(int productId) {
        this.productId = productId;
    }

    public String getproductName() {
        return productName;
    }

    public void setproductName(String productName) {
        this.productName = productName;
    }

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }

    public double getproductPrice() {
        return productPrice;
    }

    public void setproductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}
