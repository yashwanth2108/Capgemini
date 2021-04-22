package com.example.practice_1;

import com.example.practice_1.Configuration.RabbitMQConfiguration;
import com.example.practice_1.Models.Product;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

    private RabbitTemplate rabbitTemplate;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Product product = new Product();
        product.setProduct_id(100);
        product.setProduct_name("Laptop");
        product.setQuantity(10);

        System.out.println("Sending Message...");
        rabbitTemplate.convertAndSend(RabbitMQConfiguration.topicExchangeName,"message_routing_key",product);
        System.out.println("Message Send Successfully...");
    }
}
