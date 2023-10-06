package com.java8;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethod {
    public static void main(String[] args) {
        List<String> list= List.of("Sachin","Sam","Sita","Akash");

//        Filter Method
        List<String> stringList = list.stream().filter(e -> e.startsWith("S")).collect(Collectors.toList());
        System.out.println(stringList);

//        Map Method
        List<Integer> numberList=List.of(23,43,5,32,54,1);
        numberList.stream().map(e->e*e).forEach(e->{
            System.out.println("Number List:"+e);
        });

//        Another way the Print List
    list.forEach(System.out::println);
    }
}
