package com.example.question_1;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private static Customer customerObject;
    public static Customer returnCustomer()
    {
        return customerObject;
    }
    


    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        Customer customer = (Customer) applicationContext.getBean("customer");
        System.out.println();
        System.out.println();
        System.out.println(customer.toString());
        customerObject=customer;

    }

}
