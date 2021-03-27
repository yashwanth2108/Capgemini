package com.company;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Movie_Details_List {
    LinkedList<Movie_Details> Movies = new LinkedList<>();
    static Scanner sc =new Scanner(System.in);

    public void add_movie()
    {
        System.out.println("Enter the details of Movies ");
        System.out.print(" Enter the name of Movie :  ");
        String movie_name = sc.nextLine();
        System.out.print(" Enter the name of Lead Actor :  ");
        String lead_actor = sc.nextLine();
        System.out.print(" Enter the name of Lead Actress :  ");
        String lead_actress = sc.nextLine();
        System.out.print(" Enter the name of Genre :  ");
        String genre = sc.nextLine();
        Movie_Details M = new Movie_Details(movie_name,lead_actor,lead_actress,genre);
        Movies.add(M);
        System.out.println();
        System.out.println(" ==== Movie is Added Successfully ==== ");
    }
    public void remove_movie()
    {
        System.out.print("Enter the movie name u want to delete : ");
        String movie_name = sc.nextLine();
        sc.nextLine();
        Movie_Details S = null;
        for(Movie_Details M : Movies)
        {
            if(M.getMovie_Name().equalsIgnoreCase(movie_name))
            {
                S = M;
                break;
            }
        }
        if(S==null)
            System.out.println("there is not movie like that");
        else {
            Movies.remove(S);
            System.out.println();
            System.out.println(" ==== Movie is Deleted Successfully ==== ");
        }


    }
    public void remove_all_movies()
    {
        Movies.removeAll(Movies);
        System.out.println();
        System.out.println(" ==== All Movies is Deleted SuccessFully ==== ");
    }
    public void find_Movie_by_name()
    {
        System.out.print("Enter the of movie name : ");
        String s = sc.nextLine();
        for (Movie_Details M : Movies)
        {
            if(M.getMovie_Name().equalsIgnoreCase(s))
            {
                System.out.println(M.toString());
            }
        }
    }
    public void find_Movie_by_genre()
    {
        System.out.print("Enter the of genre : ");
        String s = sc.nextLine();
        for (Movie_Details M : Movies)
        {
            if(M.getGenre().equalsIgnoreCase(s))
            {
                System.out.println(M.toString());
            }
        }
    }

    public void displayInSortedOrder(String type)
    {
        if(Movies.size()==0)
        {
            System.out.println("There is no movie in the List");
            return;
        }

        List<Movie_Details> movies = new LinkedList<>();
        if(type.equalsIgnoreCase("movie name"))
        {
            Comparator<Movie_Details> compare = (h1, h2) -> h1.getMovie_Name().compareTo(h2.getMovie_Name());
            movies = Movies.stream().sorted(compare).collect(Collectors.toList());
        }
        else if(type.equalsIgnoreCase("lead actor"))
        {
            Comparator<Movie_Details> compare = (h1, h2) -> h1.getLead_actor().compareTo(h2.getLead_actor());
            movies = Movies.stream().sorted(compare).collect(Collectors.toList());
        }
        else if(type.equalsIgnoreCase("lead Actress"))
        {
            Comparator<Movie_Details> compare = (h1, h2) -> h1.getLead_actress().compareTo(h2.getLead_actress());
            movies = Movies.stream().sorted(compare).collect(Collectors.toList());
        }
        else {
            Comparator<Movie_Details> compare = (h1, h2) -> h1.getGenre().compareTo(h2.getGenre());
            movies = Movies.stream().sorted(compare).collect(Collectors.toList());
        }
        movies.forEach(p->System.out.println(p));
    }

}
