package com.company;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] a = { 5 , 12 , 14 , 6 , 78 , 19 , 1 , 23 , 26 , 35 , 37 , 7 , 52 , 86 , 47 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number to be Searched : ");
        int search = sc.nextInt();
        for(int i = 0 ; i < 15 ; i++)
        {
            if(search == a[i])
            {
                System.out.print("Number Found");
                return;
            }
        }
        System.out.print("Number not Found");
    }
}
