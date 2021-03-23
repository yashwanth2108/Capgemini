package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ArrayList<Shop_Storage> S = new ArrayList<>();
        System.out.println("Enter Your Role ");
        System.out.println("1. Owner");
        System.out.println("2. Customer");
        System.out.print("Select on of them as Number : ");
        Scanner sc = new Scanner(System.in);
        int role = sc.nextInt();
        if(role == 1)
        {
            System.out.print("Enter the Desert Item : ");
            String desertItem = sc.next();
            System.out.print("Enter the price : ");
            int price = sc.nextInt();
            Shop_Storage Sh = new Shop_Storage(desertItem,price);
            S.add(Sh);
            System.out.print("Item Added");
        }
        else
        {
            System.out.print("Enter the Desert Item : ");
            String desertItem = sc.next();
            if(desertItem.equals("Candy") || desertItem.equals("candy") || desertItem.equals("CANDY"))
            {
                Candy C = new Candy();
                System.out.print("Cost of the Desert Item -> Candy : "+C.getCost());
                System.out.print("Order Placed");
            }
            else if(desertItem.equals("Cookie") || desertItem.equals("cookie") || desertItem.equals("COOKIE"))
            {
                Cookie C = new Cookie();
                System.out.print("Cost of the Desert Item -> Candy : "+C.getCost());
                System.out.print("Order Placed");
            }
            else if(desertItem.equals("IceCream") || desertItem.equals("icecream") || desertItem.equals("ICECREAM"))
            {
                IceCream C = new IceCream();
                System.out.print("Cost of the Desert Item -> Candy : "+C.getCost());
                System.out.print("Order Placed");
            }
        }
    }
}
