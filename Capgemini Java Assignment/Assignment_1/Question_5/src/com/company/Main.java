package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your CTC in Lakhs  : ");
        float CTC = sc.nextFloat();
        if( 0 >= CTC && CTC < 180000)
        {
            System.out.println("There is No Tax on your CTC");
        }
        else if(180001 >= CTC && CTC < 300000)
        {
            System.out.println("The Total Tax will be applied on CTC is : "+0.1*CTC);
        }
        else if(300001 >= CTC && CTC < 500000)
        {
            System.out.println("The Total Tax will be applied on CTC is : "+0.2*CTC);
        }
        else
            System.out.println("The Total Tax will be applied on CTC is : "+0.3*CTC);
    }
}
