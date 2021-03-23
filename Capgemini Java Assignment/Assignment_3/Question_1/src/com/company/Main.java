package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    ArrayList<Person> person = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    while(true)
    {
        System.out.println("Enter Person Details ");
        System.out.print("Enter weight of Person");
        int weight = sc.nextInt();
        System.out.print("Enter height of Person");
        int height = sc.nextInt();
        System.out.print("Enter Name of Person");
        String name = sc.nextLine();
        sc.nextLine();
        Person P = new Person(weight,height,name);
        person.add(P);

        System.out.print("Do u want to enter more Person details : ");
        System.out.print("Say Yes or No");
        String chk = sc.next();
        if(chk.equals("NO") || chk.equals("No"))
        {
            break;
        }
    }

    }
}
