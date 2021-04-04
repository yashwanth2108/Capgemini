package com.company;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main{

    public static void main(String[] args) {
	// write your code here

        Employee E = new Employee(123123,"Manav Verma",120000);

        // Supplier Interface

        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

        // Consumer Interface

        Consumer<Employee> result = (K) -> {
            int k = K.getEmpSalary();
            k = k + 10000;
            K.setEmpSalary(k);
        };
        result.accept(E);
        System.out.println(E);

        // Predicate Interface

        Predicate<Employee> salaryCheck = i -> i.getEmpSalary() > 100000;
        System.out.println(salaryCheck.test(E));

        // Function Interface
        Thread thread = new Thread(() -> {
            for(int i=0;i<12;i++)
                System.out.println(i);
        });
        thread.start();
    }
}
