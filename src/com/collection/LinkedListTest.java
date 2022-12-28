package com.collection;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> li = new LinkedList<String>();
        li.add("sachin");
        li.add("akash");
        li.add("anku");
        li.add("himanshi");
        li.add("gayu");
        li.add("purvi");
        li.add("navyansh");
        li.addFirst("india");
        li.addLast("Mahow");
        System.out.println(li);
        for (String str:li) {
            System.out.println(str+" ");
        }
        li.add(0,"name");
        System.out.println(li);
        String s=li.get(1);
        System.out.println(s+" -> "+li);
        li.set(0,"java");
        System.out.println(li);
        li.remove(1);
        System.out.println(li);
        System.out.println(li.contains("akash"));
        System.out.println(li.indexOf("anku"));
        System.out.println(li.lastIndexOf("purvi"));
        li.clear();
        System.out.println(li);
    }
}
