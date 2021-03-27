package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println("                   Welcome to ICICI Bank");
        System.out.println();
        System.out.println();

        System.out.println("Do you want to add Account in ICICI Bank ");
        System.out.print("say Yes or No : ");
        String s =  sc.next();
        System.out.println("Enter Details");
        System.out.print("Enter Account Number : ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter Account Holder name : ");
        String accountholder = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter Account Type ");
        System.out.println("1. Saving");
        System.out.println("1. Current");
        String accountType = sc.next();
        System.out.print("Enter Account Balance : ");
        double balance = sc.nextDouble();

        if(accountType.equals("Saving") || accountType.equals("saving"))
        {
            System.out.print("Enter the Fixed Deposit amount : ");
            double fixedDeposit = sc.nextDouble();
            Saving_Account S = new Saving_Account(accountNumber, accountholder, accountType, balance, fixedDeposit);

            System.out.print("Enter Amount you want to at your account : ");
            S.updateBalance(sc.nextDouble());
            System.out.print("Enter Bank Account interest : ");
            S.updateBalance(sc.nextFloat());
            System.out.print("Details of Saving account : "+ S.toString());
        }
        else
        {
            Current_Account C = new Current_Account(accountNumber, accountholder, accountType, balance);
            System.out.print("Enter Amount you want to at your account : ");
            C.updateBalance(sc.nextDouble());
            System.out.print("Enter Bank Account interest : ");
            C.updateBalance(sc.nextFloat());
            System.out.print("Details of Current account : "+ C.toString());
        }

    }
}
