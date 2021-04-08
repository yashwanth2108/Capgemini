package com.example.transactions;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

    @Before("execution(* com.example.transactions.service.PaymentServiceImpl.makePayment())")  // * is for all type of modifiers , .. for arguments in the function
    public void printBefore()
    {
        System.out.println("Payment Started");
    }

    @After("execution(* com.example.transactions.service.PaymentServiceImpl.makePayment())")  // * is for all type of modifiers , .. for arguments in the function
    public void printAfter()
    {
        System.out.println("Payment Ended");
    }
}
