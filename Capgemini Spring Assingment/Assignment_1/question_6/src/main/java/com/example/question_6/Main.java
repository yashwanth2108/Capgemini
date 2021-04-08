package com.example.question_6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan({"com.example.question_6"})
public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(Main.class, args);
        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("spring.xml");
        Employee employee = applicationContext.getBean(Employee.class);
    }

}
