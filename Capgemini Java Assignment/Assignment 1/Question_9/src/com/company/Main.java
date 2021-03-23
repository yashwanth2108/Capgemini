package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class Student
{
    int marks_A;
    int marks_B;
    int marks_C;

    Student(int a , int b , int c)
    {
        marks_A=a;
        marks_B=b;
        marks_C=c;
    }

    int getMarks_A()
    {
        return marks_A;
    }
    int getMarks_B()
    {
        return marks_B;
    }
    int getMarks_C()
    {
        return marks_C;
    }
}

public class Main {


    public static void main(String[] args) {
	// write your code here
        int i = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> A = new ArrayList<>();
        while(++i<=3)
        {
            System.out.print("Enter the marks of Subjects A B C for Student "+i+" In sequence Order with space : ");
            Student S = new Student(sc.nextInt(),sc.nextInt(),sc.nextInt());
            A.add(S);
        }
        int Total_A = 0 , Total_B = 0 , Total_C = 0 ;
        for(int j=0;j<A.size();j++)
        {

            Total_A += A.get(j).getMarks_A() ;
            Total_B += A.get(j).getMarks_B() ;
            Total_C += A.get(j).getMarks_C() ;
        }

        System.out.println("Total Marks for Subject A : "+ Total_A + " and Averge Marks : " + Total_A/3);
        System.out.println("Total Marks for Subject A : "+ Total_B + " and Averge Marks : " + Total_B/3);
        System.out.println("Total Marks for Subject A : "+ Total_C + " and Averge Marks : " + Total_C/3);
    }
}
