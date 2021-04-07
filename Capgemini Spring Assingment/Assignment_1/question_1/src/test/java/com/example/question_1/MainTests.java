package com.example.question_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTests {

    @Test
    void contextLoads() {
        String[] args = new String[0];
        Address address = new Address("sita ki mathiya , chowk","Shahjahanpur","Uttar Pradesh",242001,"India");
        Customer customer = new Customer(123123,"Manav Verma",990088977,address);
        Main.main(args);

        Assertions.assertEquals(customer.toString(),Main.returnCustomer().toString());
    }

}
