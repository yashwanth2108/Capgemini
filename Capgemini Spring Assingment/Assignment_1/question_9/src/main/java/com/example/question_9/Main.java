package com.example.question_9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Employee employee = applicationContext.getBean("employee",Employee.class);
        System.out.println(employee);
        applicationContext.registerShutdownHook();

    }

}
