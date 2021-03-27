package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 10 , b = 22;
        functional_Interface sum = (int c , int d) -> (c + d);
        System.out.println(sum);

        functional_Interface subtract = (int c ,int d) -> (c - d);
        System.out.println(subtract);

        functional_Interface divide = (int c ,int d) -> (c / d);
        System.out.println(divide);

        functional_Interface multiply = (int c ,int d) -> (c / d);
        System.out.println(multiply);

    }
}

@FunctionalInterface
interface functional_Interface
{
    int test(int a,int b);
}