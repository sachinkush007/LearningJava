package com.containsOrNot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Animal animal1=new Animal("Dog","blak",1);
        Animal animal2=new Animal("Monkey","Brown",2);
        Animal animal3=new Animal("Rabbit","White",3);
//animal1.setName("lion");
       // System.out.println(animal1);
        animal1.setName("Lion");
        List<Animal>li=new ArrayList<>();
        li.add(animal1);
        li.add(animal2);
        li.add(animal3);

        for(int i=0;i<li.size();i++){
            System.out.println(li.get(i));
        }
        System.out.println( li.contains("Dog"));
        System.out.println( li.contains(animal2));
        System.out.println( li.contains(animal3));

        Collections.sort(li);


        System.out.println(li);

    }
}
