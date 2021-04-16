package com.example.question_4;

import com.example.question_4.Repository.MyUserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = MyUserRepository.class)
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
