package com.example.question_9.Model;


import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

@Entity
public class Customer {

    @Id
    private Integer customerId;
    private String customerName;

    public Customer(Integer customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public Customer() {

    }

    @javax.persistence.Id
    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

}
