package com.company;

import java.util.Hashtable;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        Hashtable<Person, Person> person = new Hashtable<>();
        while (true) {
            System.out.println("Enter Person Details ");
            System.out.print("Enter weight of Person : ");
            int weight = sc.nextInt();
            System.out.print("Enter height of Person : ");
            int height = sc.nextInt();
            System.out.print("Enter Full Name of Person : ");
            sc.nextLine();
            String name = sc.nextLine();
            Person P = new Person(weight, height, name);
            person.put(P, P);
            System.out.println("Do u want to enter more Person details : ");
            System.out.print("Say Yes or No :  ");
            String chk = sc.next();
            if (chk.equalsIgnoreCase("No")) {
                break;
            }
        }
        System.out.println("HashTable With Override Hashcode and equals  : ");
        person.forEach((K, V) -> {
            System.out.println(K.getName() + " " + V.getWeight() + " " + V.getHeight());
        });


        Hashtable<Employee, Integer> H = new Hashtable<>();
        int i = 0;
        while (true) {
            System.out.println("Enter Employee Details ");
            System.out.print("Enter ID of Employee : ");
            int weight = sc.nextInt();
            System.out.print("Enter Full Name of Employee : ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Enter salary of Employee : ");
            int height = sc.nextInt();
            Employee P = new Employee(weight, name, height);
            H.put(P, ++i);
            System.out.println("Do u want to enter more Employee details : ");
            System.out.print("Say Yes or No :  ");
            String chk = sc.next();
            if (chk.equalsIgnoreCase("No")) {
                break;
            }

        }
        System.out.println("HashTable With Fixed value returned by Hashcode and always return true by equals  : ");
        H.forEach((K, V) -> {
            System.out.println(K.getEmpName()+" "+K.getEmpId()+" "+K.getSalary()+" Value : "+V);
        });

        System.out.println("Size of HashTable is "+H.size());

        System.out.println("If the Value is Fixed for Hashcode and Equal always return true then 1st Entry Will be there only in the Hashtable");
    }
}
