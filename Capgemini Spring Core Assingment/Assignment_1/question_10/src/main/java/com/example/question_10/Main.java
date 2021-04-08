package com.example.question_10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        ContextAwareTesting contextAwareTesting = applicationContext.getBean("testing",ContextAwareTesting.class);
        contextAwareTesting.run();
    }

}
