package com.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapANDFilter {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1, 2, 3, 4, 2, 3, 5, 6, 7, 1);
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");


        List<Integer> even= list.stream().filter(e->e%2==0).distinct().collect(Collectors.toList());
        System.out.println(even);

        List<Integer>square=list.stream().map(e->e*e).collect(Collectors.toList());
        System.out.println(square);

        int sumOfSquaresOfEvenNumbers = list.stream()
                .filter(num -> num % 2 == 0)    // Filter out even numbers
                .mapToInt(num -> num * num)     // Square each number
                .sum();                         // Sum up the squares

        System.out.println("Sum of squares of even numbers: " + sumOfSquaresOfEvenNumbers);


        List<String>upercase=strings.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upercase);
    }
}
