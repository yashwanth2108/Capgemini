package com.company;

import java.util.Scanner;

public class Main {


    // Create CUI based Application , ask for user to enter username and password
    public static void main(String[] args) {
	// write your code here
        String Username = "manav_hack" , Password = "manav123";
        Scanner sc =  new Scanner(System.in);
        int i=0;
        while(++i<=3)
        {
            System.out.println();
            System.out.println("---- Login Here ----");
            System.out.print("Username : ");
            String Username1 = sc.nextLine();
            System.out.print("Password : ");
            String Password1 = sc.nextLine();
            if(Username.equals(Username1) && Password.equals(Password1))
            {
                System.out.print("Welcome To CUI Based Application");
                break;
            }
            if (!Username.equals(Username1))
            {
                if(i<3)
                    System.out.print("Wrong Username !! , Please Type it CareFully");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                continue;
            }
            if (!Password.equals(Password1))
            {
                if(i<3)
                    System.out.print("Wrong Password !! , Please Type it CareFully");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                continue;
            }
        }
        if(i==4)
            System.out.print("Contact to Admin About your Credentials");
    }
}
