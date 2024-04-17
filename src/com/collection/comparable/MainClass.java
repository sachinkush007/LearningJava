package com.collection.comparable;

import com.collection.comparable.Movie;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass {
    public static void main(String[] args) {
        Movie movie=new Movie("Faouzi",2.7,2019);
        Movie movie1=new Movie("Ram",2.8,2018);

        ArrayList<Movie> list=new ArrayList<Movie>();
        list.add(movie);
        list.add(movie1);
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));
        Collections.sort(list);
        System.out.println("Movies after sorting : ");
        for (Movie movies: list)
        {
            System.out.println(movies.getName() + " " +
                    movies.getRating() + " " +
                    movies.getYear());
        }
        System.out.println("\n Sorted by Year Using Lambda: ");

        Collections.sort(list,(a,b)->b.getYear()-a.getYear());
        for (Movie m:list){
            System.out.println(m.getRating() + " "
                    + m.getName() + " "
                    + m.getYear());

        }
        System.out.println("\n Sorted by rating: ");

        RatingCompare ratingCompare=new RatingCompare();
        Collections.sort(list,ratingCompare);

        for (Movie m:list){
            System.out.println(m.getRating() + " "
                    + m.getName() + " "
                    + m.getYear());

        }

        System.out.println("\nSorted by name");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(list, nameCompare);
        for (Movie m1 : list)
            System.out.println(m1.getName() + " "
                    + m1.getRating() + " "
                    + m1.getYear());


    }
}
