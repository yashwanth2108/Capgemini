package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println();
            System.out.println();
            System.out.println("Welcome To Capgemini");
            System.out.println();
            System.out.println("want to add Employee Details then say : Yes or No");
            String s = sc.next();
            if(s.equals("No") || s.equals("no") || s.equals("NO"))
            {
                break;
            }


            System.out.print("Enter Your Employee ID : ");
            int Emp_id = sc.nextInt();
            System.out.print("Enter Your Employee Name : ");
            String Emp_name = sc.nextLine();
            sc.nextLine();
            System.out.print("Enter Your Employee Age : ");
            int Emp_age = sc.nextInt();
            System.out.print("Enter Your Employee Salary : ");
            double salary = sc.nextDouble();
            System.out.print("Enter Your Employee Bonus : ");
            int bonus = sc.nextInt();


            System.out.println("Which Type of Employee you are ");
            System.out.println("1. Manager ");
            System.out.println("2. Labour  ");
            System.out.print("select one of them by using number : ");
            int chk = sc.nextInt();
            if(chk == 1)
            {
                int incentive = 11000;
                String Emp_Type = "Manager";

                Manager M = new Manager(Emp_id,Emp_name,Emp_age,Emp_Type,salary,bonus,incentive);
                M.FinalSalary();
                System.out.println("Your Salary : "+M.getSalary());

                System.out.println("Your all Details : "+M.toString());
            }
            else
            {
                System.out.print("Enter the Overtime of Your Job : ");
                int Overtime = sc.nextInt();
                String Emp_Type = "Labour";

                Labour L = new Labour(Emp_id,Emp_name,Emp_age,Emp_Type,salary,bonus,Overtime);
                L.FinalSalary();
                System.out.println("Your Salary : "+L.getSalary());

                System.out.println("Your all Details : "+L.toString());
            }
            System.out.println("Details Submitted");

        }







    }
}
