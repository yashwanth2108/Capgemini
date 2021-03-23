package com.company;

import java.util.Scanner;

public class Main {

    // find Simple Interest and Compound Interest
    public static void main(String[] args) {
	// write your code here

        double Simple_Interest , Compound_Interest , Time , Rate , Principal , Times_Compounded_Per_Unit , Amount;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        Principal = sc.nextDouble();
        System.out.println();
        System.out.print("Enter the Time : ");
        Time = sc.nextDouble();
        System.out.println();
        System.out.print("Enter the Rate : ");
        Rate = sc.nextDouble();
        System.out.println();
        System.out.print("Enter the number of times that interest is compounded per unit time : ");
        Times_Compounded_Per_Unit = sc.nextDouble();

        Rate = Rate / 100 ;

        Simple_Interest = Principal * Time * Rate;

        Amount = Principal * ( 1 + Rate * Time);

        System.out.println("This it the Simple Interest : " + Simple_Interest + " and This is the Total Amount : " + Amount);

        double Sum = 1;
        for(int i = 0 ; i < Times_Compounded_Per_Unit * Time  ; i++)
        {
            Sum *= 1 + Rate / Times_Compounded_Per_Unit;
        }

        Amount = Principal * Sum;

        Compound_Interest = Amount - Principal;

        System.out.println("This it the Compound Interest : " + Compound_Interest + " and This is the Total Amount : " + Amount);
    }
}
