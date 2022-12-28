package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args){
        int ar[]={1,2,3,4,5,5};

        for (int x:ar) {
            System.out.println(x);
        }
        List<int[]> l= Arrays.asList(ar);//convert into array to arrayList
        ArrayList<Integer> s = new ArrayList<Integer>();
        s.add(20);
        s.add(10);
        s.add(60);
        s.add(40);
        s.add(80);
        s.add(2,90);
        //Collections.sort()
        System.out.println(s);
        System.out.println("****** iterate for loop *****");
        for (int i=0;i<s.size();i++) {
            System.out.println(s.get(i));
        }
        int g=s.get(4);
        System.out.println("element on index posi is :"+g);//for get which element is which position
        int se=s.set(3,100);
        System.out.println("element is set on index posi no :"+s);
        System.out.println("****** iterate for each loop ******");
        for (int num:s) {
            System.out.println(num);//using for loop
        }
        Collections.sort(s);
        System.out.println(s);
    }
}
