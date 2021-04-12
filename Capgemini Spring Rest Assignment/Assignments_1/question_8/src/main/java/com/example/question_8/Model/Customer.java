package com.example.question_8.Model;

public class Customer {

    private String customerName;
    private String customerNumber;
    private String customerAddress;
    private int customerId;

    Customer()
    {

    }

    public Customer(String customerName, String customerNumber, String customerAddress, int customerId) {
        this.customerName = customerName;
        this.customerNumber = customerNumber;
        this.customerAddress = customerAddress;
        this.customerId = customerId;
    }

    public int getcustomerId() {
        return customerId;
    }

    public void setcustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getcustomerName() {
        return customerName;
    }

    public void setcustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getcustomerNumber() {
        return customerNumber;
    }

    public void setcustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getcustomerAddress() {
        return customerAddress;
    }

    public void setcustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
}
