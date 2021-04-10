package com.example.question_6;

import com.example.question_6.Controller.DatabaseConfiguration;
import com.example.question_6.Model.Database;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan(basePackages = {"com.example.question_6.Model"})
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DatabaseConfiguration.class);
        DatabaseConfiguration databaseConfiguration = applicationContext.getBean(DatabaseConfiguration.class);
        System.out.println(databaseConfiguration.databaseDetails());
    }

}
