package com.collection.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Movie implements Comparable<Movie>{

   private String name ;
   private int year;
   private double rating;

    public Movie(String name,double rating, int year) {
        this.name = name;
        this.year = year;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public int compareTo(Movie movie) {
      return  this.year - movie.year;
    }


}
class RatingCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        if (m1.getRating() < m2.getRating())
            return -1;
        if (m1.getRating() > m2.getRating())
            return 1;
        else
            return 0;
    }
}
class NameCompare implements Comparator<Movie> {
    public int compare(Movie m1, Movie m2)
    {
        return m1.getName().compareTo(m2.getName());
    }
}
