package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiCustom {
    public static void main(String[] args) {

//        Create a List and filter the even numbers
        List<Integer>list=List.of(1,2,3,4,5,6,7,8,9,10);
        ArrayList<Integer>list1=new ArrayList<Integer>();
        list1.add(12);
        list1.add(22);
        list1.add(33);
        list1.add(11);
        List<Integer>evenNumList=new ArrayList<>();
        for (Integer i:list) {
            if (i%2==0){
                evenNumList.add(i);
            }
        }
        System.out.println(list);
        System.out.println(evenNumList);


//        Using Stream API
        Stream<Integer> stream = list1.stream();
        List<Integer> collectNewList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(list1);
        System.out.println(collectNewList);

        List<Integer> maxList = list.stream().filter(i->i>5).collect(Collectors.toList());
        System.out.println(maxList);

    }
}
