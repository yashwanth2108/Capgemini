package com.company;


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


       List<Transaction> transactions = Arrays.asList(  new Transaction(new Trader("Manav Verma","Indore") , 2019 , 22000)
               ,new Transaction(new Trader("Priyam Verma","Indore"),2001,12000)
               ,new Transaction(new Trader("Rahul Verma","Hyderabad"),2011 , 12300)
               ,new Transaction(new Trader("Rachit Verma","Noida"),2011 , 14000)
               ,new Transaction(new Trader("Rishabh Verma","Delhi"),2011,20000)
               ,new Transaction(new Trader("Harsh Verma","Lucknow"),2006,15000)
               ,new Transaction(new Trader("Vikas Verma","Mumbai"),2011,16000)
               ,new Transaction(new Trader("Vivek Verma","Banglore"),1998 , 12000)
               ,new Transaction(new Trader("Shreya Verma","Pune"),2011 , 15300)
               ,new Transaction(new Trader("Gudiya Verma","Pune"),2011 , 17300)
               ,new Transaction(new Trader("Shrant Verma","Pune"),2011 , 9300));





        System.out.println(" ====== Display the fruit names of low calories fruits i.e. calories < 100 sorted in descending order of calories. ===== ");
        System.out.println();
        System.out.println();
        // Display the fruit names of low calories fruits i.e. calories < 100 sorted in descending order of calories.

        List<Fruit> L =   fruits.stream()
                                .filter(p -> p.getCalories() < 100)
                                .sorted((Fruit o1, Fruit o2) -> o1.getCalories() > o2.getCalories() ? 1 : -1)
                                .collect(Collectors.toList());

        L.forEach(System.out::println);

        // Display color wise list of fruit names.

        System.out.println();
        System.out.println();
        System.out.println(" ====== Display color wise list of fruit names. ===== ");
        System.out.println();
        System.out.println();

          fruits.stream()
                .sorted(Comparator.comparing(Fruit::getColor))
                .forEach(p -> System.out.println(p.getName()));

        // Display only RED color fruits sorted as per their price in ascending order.

        System.out.println();
        System.out.println();
        System.out.println(" ====== Display only RED color fruits sorted as per their price in ascending order. ===== ");
        System.out.println();
        System.out.println();

          fruits.stream()
                .filter(p -> p.getColor().equalsIgnoreCase("Red"))
                .sorted((Fruit o1, Fruit o2) -> o1.getPrice() < o2.getPrice() ? 1 : -1)
                .forEach(System.out::println);


        // Find out the newsld which has received maximum comments.

        System.out.println();
        System.out.println();
        System.out.println(" ====== Find out the newsld which has received maximum comments. ===== ");
        System.out.println();
        System.out.println();

        Map<Integer,List<News>> groupByNewsId = news.stream()
                                                    .collect(Collectors.groupingBy(News::getNewsId));

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

        System.out.println();
        System.out.println();
        System.out.println(" ====== Find out how many times the word budget' arrived in user comments all news. ===== ");
        System.out.println();
        System.out.println();

        long x = news.stream()
                     .filter(p -> p.getComment().contains("Budget"))
                     .count();

        System.out.println(x);

        // Find out which user has posted maximum comments

        System.out.println();
        System.out.println();
        System.out.println(" ====== Find out which user has posted maximum comments. ===== ");
        System.out.println();
        System.out.println();

        Map<String,List<News>> groupByCommentByUser = news.stream()
                                                          .collect(Collectors.groupingBy(News::getCommentByUser));

        int max1 = 0 ;
        String userName = "";
        for (Map.Entry<String,List<News>> M : groupByCommentByUser.entrySet())
        {
            if(max1 < M.getValue().size())
            {
                max1 = M.getValue().size();
                userName = M.getKey();
            }
        }
        System.out.println("User Name : "+userName);

        // Display commentByUser wise number of comments.

        System.out.println();
        System.out.println();
        System.out.println(" ====== Display commentByUser wise number of comments. ===== ");
        System.out.println();
        System.out.println();

        for (Map.Entry<String,List<News>> M : groupByCommentByUser.entrySet())
        {
            System.out.println(M.getKey() + " -> " + M.getValue().size());
        }

        // Find all transactions in the year 2011 and sort them by value (small to high)

        System.out.println();
        System.out.println();
        System.out.println(" ====== Find all transactions in the year 2011 and sort them by value (small to high) ===== ");
        System.out.println();
        System.out.println();

        transactions.stream()
                    .filter(p -> p.getYear() == 2011)
                    .sorted((Transaction o1, Transaction o2) -> (o1.getValue() < o2.getValue() ? 1 : -1))
                    .forEach(System.out::println);

        // What are all the unique cities where the traders work?

        System.out.println();
        System.out.println();
        System.out.println(" ====== What are all the unique cities where the traders work? ===== ");
        System.out.println();
        System.out.println();

        Map<String,List<Transaction>> groupByCities = transactions.stream()
                                                                  .collect(Collectors.groupingBy(p -> p.getTrader().getCity()));
        for (Map.Entry<String,List<Transaction>> M : groupByCities.entrySet())
        {
            System.out.println(M.getKey());
        }

        // Find all traders from Pune and sort them by name

        System.out.println();
        System.out.println();
        System.out.println(" ====== Find all traders from Pune and sort them by name ===== ");
        System.out.println();
        System.out.println();

        transactions.stream()
                    .filter(p -> p.getTrader().getCity().equalsIgnoreCase("Pune"))
                    .sorted(Comparator.comparing((Transaction o) -> o.getTrader().getName()))
                    .forEach(System.out::println);

        // Return a string of all traders names sorted alphabetically.

        System.out.println();
        System.out.println();
        System.out.println(" ====== Return a string of all traders names sorted alphabetically. ===== ");
        System.out.println();
        System.out.println();

        String s  = transactions.stream()
                                .sorted(Comparator.comparing((Transaction o) -> o.getTrader().getName()))
                                .map(p->p.getTrader().getName())
                                .collect(Collectors.joining(" | "));

        System.out.println(s);


        // Are any traders based in Indore?

        System.out.println();
        System.out.println();
        System.out.println(" ====== Are any traders based in Indore? ===== ");
        System.out.println();
        System.out.println();

        transactions.stream()
                    .filter(p->p.getTrader().getCity().equalsIgnoreCase("Indore"))
                    .map(p->p.getTrader().getName())
                    .forEach(System.out::println);

        // Print all transactions' values from the traders living in Delhi.

        System.out.println();
        System.out.println();
        System.out.println(" ====== print all transactions' values from the traders living in Delhi. ===== ");
        System.out.println();
        System.out.println();

        transactions.stream()
                    .filter(p->p.getTrader().getCity().equalsIgnoreCase("delhi"))
                    .forEach(System.out::println);

        // What's the highest value of all the transactions?

        System.out.println();
        System.out.println();
        System.out.println(" ====== What's the highest value of all the transactions?. ===== ");
        System.out.println();
        System.out.println();

        transactions.stream()
                    .sorted((Transaction o1, Transaction o2) -> o1.getValue() < o2.getValue() ? 1 : -1)
                    .limit(1).
                    forEach(System.out::println);

        // Find the transaction with the smallest value

        System.out.println();
        System.out.println();
        System.out.println(" ====== Find the transaction with the smallest value ===== ");
        System.out.println();
        System.out.println();


        transactions.stream().sorted((Transaction o1, Transaction o2) -> o1.getValue() > o2.getValue() ? 1 : -1).limit(1).forEach(System.out::println);



    }
}
