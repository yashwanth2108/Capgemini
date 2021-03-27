package com.company;

import org.w3c.dom.ls.LSInput;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here


        List<Fruit> fruits = Arrays.asList(new Fruit("Mango", 65, 45, "Yellow")
                , new Fruit("Orange", 125, 25, "Orange")
                , new Fruit("Apple", 85, 35, "Red")
                , new Fruit("Grapes", 72, 56, "Green")
                , new Fruit("Banana", 115, 35, "Yellow")
                , new Fruit("Strawberry", 85, 35, "Red")
                , new Fruit("Watermelon", 35, 75, "Green"));

        List<News> news = Arrays.asList(new News(123123 , "Manav Verma" , "Priyam Verma" , "This is Amazing News For Budget")
                ,new News(123123 , "Manav Verma" , "John Cena" , "Wow , its a great Budget Budget Budget law passed")
                ,new News(123123 , "Manav Verma" , "Rahul Jain" , "Dam nice , new Budget law , lets have to maintain the Budget ")
                ,new News(123125 , "John Cena" , "Priyam Verma" , "This is Amazing News ")
                ,new News(123125 , "John Cena" , "Manav Verma" , "I knew it")
                ,new News(123124 , "Rahul Jain" , "Priyam Verma" , "will see in future , there will be new law for Budget"));


        // Display the fruit names of low calories fruits i.e. calories < 100 sorted in descending order of calories.

        List<Fruit> L = fruits.stream().filter(p -> p.getCalories() < 100).sorted(new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                return o1.getCalories() > o2.getCalories() ? 1 : -1;
            }
        }).collect(Collectors.toList());
        L.forEach(System.out::println);

        // Display color wise list of fruit names.


        fruits.stream().sorted(new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                return o1.getColor().compareTo(o2.getColor());
            }
        }).forEach(p -> System.out.println(p.getName()));

        // Display only RED color fruits sorted as per their price in ascending order.

        fruits.stream().filter(p -> p.getColor().equalsIgnoreCase("Red")).sorted(new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                return o1.getPrice() < o2.getPrice() ? 1 : -1;
            }
        }).forEach(System.out::println);


        // Find out the newsld which has received maximum comments.

        Map<Integer,List<News>> groupByNewsId = news.stream().collect(Collectors.groupingBy(News::getNewsId));
        int max = 0 ,  newsId = 0;
        for (Map.Entry<Integer,List<News>> M : groupByNewsId.entrySet())
        {
            if(max < M.getValue().size())
            {
                max = M.getValue().size();
                newsId = M.getKey();
            }
        }
        System.out.println("News Id : "+newsId);

        // Find out how many times the word budget' arrived in user comments all news

        long x = news.stream().filter(p -> p.getComment().contains("Budget")).count();
        System.out.println(x);

        // Find out which user has posted maximum comments

        // Display commentByUser wise number of comments.

        // Find all transactions in the year 2011 and sort them by value (small to high)

        // What are all the unique cities where the traders work?

        // Find all traders from Pune and sort them by name

        // Return a string of all traders names sorted alphabetically.

        // Are any traders based in Indore?

        // Print all transactions' values from the traders living in Delhi.

        // What's the highest value of all the transactions?

        // Find the transaction with the smallest value





        // only red color fruits sorted as


    }
}
