package com.company;

import java.util.Scanner;

public class Main {

    // Result Declare on the basis of marks distributed in 3 subjects
    public static void main(String[] args) {
	// write your code here

        int Physics , Chemistry , Biology;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks in Science Subjects ");
        System.out.print("Enter Physics marks : ");
        Physics = sc.nextInt();

        System.out.print("Enter Chemistry marks : ");
        Chemistry = sc.nextInt();

        System.out.print("Enter Chemistry marks : ");
        Biology = sc.nextInt();

        if(Physics > 60 && Chemistry > 60 && Biology > 60)
            System.out.println("You are Passed");
        else if( (Physics > 60 && Chemistry > 60 ) || (Biology > 60 && Chemistry > 60) || (Biology > 60 && Physics > 60) )
            System.out.println("You are Promoted");
        else
            System.out.println("You are Failed");
    }
}
