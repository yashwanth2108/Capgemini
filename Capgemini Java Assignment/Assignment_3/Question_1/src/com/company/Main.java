package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
    TreeMap<Person,Person> person = new TreeMap<>();
    Scanner sc = new Scanner(System.in);
    while(true)
    {
        System.out.println("Enter Person Details ");
        System.out.print("Enter weight of Person : ");
        int weight = sc.nextInt();
        System.out.print("Enter height of Person : ");
        int height = sc.nextInt();
        System.out.print("Enter Full Name of Person : ");
        sc.nextLine();
        String name = sc.nextLine();
        Person P = new Person(weight,height,name);
        person.put(P,P);
        System.out.println("Do u want to enter more Person details : ");
        System.out.print("Say Yes or No :  ");
        String chk = sc.next();
        if(chk.equalsIgnoreCase("No"))
        {
            break;
        }
    }
    person.forEach((K,V)->{
        System.out.println(K.getName()+" "+V.getWeight()+" "+V.getHeight());
    });
    }
}
