package com.company;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

public class BankAccountList {
    static TreeMap<Integer,Saving_Account> accounts = new TreeMap<>();
    Scanner sc = new Scanner(System.in);


    public void addAccount()
    {
        System.out.println("Enter the Details for your Saving Account");
        System.out.print("Enter your Account Holder name  : ");
        String accountHolderName = sc.nextLine();
        sc.nextLine();
        System.out.print("Enter your Account Balance  : ");
        double acc_balance = sc.nextDouble();
        System.out.print("Enter your Account ID  : ");
        int acc_id = sc.nextInt();
        System.out.print("Is it your saving account also  : ");
        Boolean isSalaryAccount;
        String s = sc.next();
        if(s.equalsIgnoreCase("yes"))
            isSalaryAccount=true;
        else
            isSalaryAccount=false;

        Saving_Account S = new Saving_Account(acc_balance,acc_id,accountHolderName,isSalaryAccount);
        if(accounts.containsKey(acc_id))
            System.out.println("This Account ID is already exists");
        else
            accounts.put(acc_id,S);
    }


    public void displayAccount()
    {
        accounts.forEach((K,V)->{
            System.out.println("Account ID : "+K+" Details :   "+V.toString());
            System.out.println();
        });
    }


    public void main(String[] args) {
        BankAccountList B = new BankAccountList();
        System.out.println("Welcome to the ICICI BANK");
        while(true)
        {
            System.out.println("select one of them : ");
            System.out.println("1. Add Saving Account");
            System.out.println("2. Display All Accounts");
            int ch = B.sc.nextInt();
            switch (ch)
            {
                case 1 :    B.addAccount();
                            break;
                case 2 :    B.displayAccount();
                            break;
                default:    System.out.println("THere is no choice like that");
            }
        }
    }
}
