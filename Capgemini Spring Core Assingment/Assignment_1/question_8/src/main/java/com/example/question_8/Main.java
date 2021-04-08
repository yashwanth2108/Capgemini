package com.example.question_8;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.management.InstanceAlreadyExistsException;


@SpringBootApplication
public class Main {

    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
        try{
            AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
            applicationContext.registerShutdownHook();
            JavaPostProcessing javaPostProcessing = applicationContext.getBean("postProcessing",JavaPostProcessing.class);
            JavaPostProcessor javaPostProcessor = applicationContext.getBean("postProcessor",JavaPostProcessor.class);
            applicationContext.close();
        }
        catch (BeanCreationException i)
        {

        }
    }

}
