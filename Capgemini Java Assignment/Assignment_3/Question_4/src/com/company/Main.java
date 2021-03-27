package com.company;

import javax.naming.ldap.SortKey;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        HashMap<Date,Employee> H = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter Employee Details ");
            System.out.print("Enter Full Name of Employee : ");
            String name = sc.next();
            sc.nextLine();
            System.out.print("Enter days of DOB : ");
            int days = sc.nextInt();
            System.out.print("Enter Month of DOB : ");
            int months = sc.nextInt();
            System.out.print("Enter year of DOB : ");
            int years = sc.nextInt();
            Employee P = new Employee(name);
            Date D = new Date(days,months,years);
            H.put(D,P);
            System.out.println("Do u want to enter more Employee details : ");
            System.out.print("Say Yes or No :  ");
            String chk = sc.next();
            if(chk.equalsIgnoreCase("No"))
            {
                break;
            }

        }
        TreeMap<Date,Employee> t =  new TreeMap<>(H);
        System.out.println("HashMap With Fixed value returned by Hashcode and always return true by equals ");
        Iterator I = t.entrySet().iterator();
        Date C = new Date(0,0,0);
        while(I.hasNext())
        {
            Map.Entry M = (Map.Entry) I.next();
            Date D = (Date) M.getKey();
            Employee E = (Employee) M.getValue();
            System.out.println(D.toString());
            try {
                int i = D.GetDOB(C);
            }
            catch (InvalidDOBException e)
            {
                e.printStackTrace();
            }
            C=D;
        }
    }
}
