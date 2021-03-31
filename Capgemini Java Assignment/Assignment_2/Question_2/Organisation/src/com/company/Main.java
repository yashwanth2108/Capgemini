package com.company;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        System.out.println("Want to run test cases");
        Scanner sc = new Scanner(System.in);
        String t = sc.next();
        if(t.equalsIgnoreCase("yes"))
        {
            String Directory = "C:\\Users\\MVERMA\\Capgemini\\Capgemini Java Assignment\\Assignment_2\\Question_2\\Organisation\\out\\Test Cases";

            File directoryPath = new File(Directory);

            String[] allFiles = directoryPath.list();

            String[] A;
            int Emp_id;
            String Emp_name;
            int Emp_age;
            String Emp_Type;
            double salary;
            int bonus;

            int i=0;
            for(String s : allFiles)
            {
                String testcase = Files.readString(Path.of(directoryPath+"\\"+s));
                String[] input = testcase.split(",");
                Emp_id = Integer.parseInt(input[0]);
                Emp_name = input[1];
                Emp_age = Integer.parseInt(input[2]);
                Emp_Type = input[3];
                salary = Double.parseDouble(input[4]);
                bonus = Integer.parseInt(input[5]);

                if(Emp_Type.equalsIgnoreCase("Manager"))
                {
                    int incentive = Integer.parseInt(input[6]);
                    Manager M = new Manager(Emp_id,Emp_name,Emp_age,Emp_Type,salary,bonus,incentive);
                    M.FinalSalary();

                    System.out.println("Your all Details : "+M.toString());
                }
                else
                {
                    int Overtime = Integer.parseInt(input[6]);

                    Labour L = new Labour(Emp_id,Emp_name,Emp_age,Emp_Type,salary,bonus,Overtime);
                    L.FinalSalary();

                    System.out.println("Your all Details : "+L.toString());
                }
                System.out.println();
                System.out.println("Test Case "+ (++i) + " Passed Successfully ");
                System.out.println();
                System.out.println();
            }

            return;
        }


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
