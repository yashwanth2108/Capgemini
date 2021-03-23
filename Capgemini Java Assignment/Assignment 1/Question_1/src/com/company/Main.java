package com.company;

import java.util.Scanner;

public class Main {

    //  The Number is Armstrong or not
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int k = n;
        int sum =0;
        while(k>0)
        {
            int rem = k%10;
            sum += rem*rem*rem;
            k = k/10;
        }
        if(sum == n)
            System.out.println("It is an Armstrong Number : "+n);
        else
            System.out.println("It is not an Armstrong Number : "+n);
    }

}
