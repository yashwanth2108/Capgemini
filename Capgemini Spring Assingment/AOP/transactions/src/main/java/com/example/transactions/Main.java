package com.example.transactions;

import com.example.transactions.service.PaymentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        PaymentService paymentService = applicationContext.getBean("paymentService",PaymentService.class);
        paymentService.makePayment();
    }

}
