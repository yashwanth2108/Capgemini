package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Movie_Details_List M = new Movie_Details_List();
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println();
            System.out.println();
            System.out.println("Welcome to the HollyWood ");
            System.out.println();
            System.out.println("Select your option ");
            System.out.println("1. Add Movie");
            System.out.println("2. Remove Movie");
            System.out.println("3. Remove All Movies");
            System.out.println("4. Search Movie by Movie Name");
            System.out.println("5. Search Movie by Genre");
            System.out.println("6. Sort Movie by requirement");
            System.out.println();
            System.out.print("Enter your Choice by number : ");
            int i = sc.nextInt();
            switch (i)
            {
                case 1 :    M.add_movie();
                            break;

                case 2 :    M.remove_movie();
                            break;

                case 3 :    M.remove_all_movies();
                            break;

                case 4 :    M.find_Movie_by_name();
                            break;

                case 5 :    M.find_Movie_by_genre();
                            break;

                case 6 :    System.out.println("Enter the type , according to that u want to sort");
                            System.out.println("By -> Movie Name");
                            System.out.println("By -> Lead Actor");
                            System.out.println("By -> Lead Actress");
                            System.out.println("By -> Genre");
                            sc.nextLine();
                            String s =  sc.nextLine();
                            M.displayInSortedOrder(s);
                            break;

                default:    System.out.println("there is no option like that");
            }
        }
    }
}
