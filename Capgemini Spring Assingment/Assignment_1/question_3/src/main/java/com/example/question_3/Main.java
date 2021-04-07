package com.example.question_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);

        // application context
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        BankAccountController bankAccountController = applicationContext.getBean("bankAccountController",BankAccountController.class);

        bankAccountController.bankAccountRepository.bankAccountMap.forEach( (p,q) -> System.out.println(p+" "+q));



        System.out.println(bankAccountController.getBalance(123123));

        System.out.println(bankAccountController.withdraw(123124,10000));

        System.out.println(  bankAccountController.bankAccountRepository.bankAccountMap.get(123123L)+
                " -> " + bankAccountController.deposit(123123,12000) +
                " -> " + bankAccountController.bankAccountRepository.bankAccountMap.get(123123L));
        System.out.println(  bankAccountController.bankAccountRepository.bankAccountMap.get(123124L)+" to " +
                        bankAccountController.bankAccountRepository.bankAccountMap.get(123123L) +
                " -> " + bankAccountController.fundTransfer(123124,123123,20000) +
                " -> " + bankAccountController.bankAccountRepository.bankAccountMap.get(123124L) + " to " +
                bankAccountController.bankAccountRepository.bankAccountMap.get(123123L));
    }



}
