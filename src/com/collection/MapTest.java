package com.collection;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
    Map<Integer,String> num=new HashMap<Integer,String>();
        num.put(1,"java");
        num.put(2,"C");
        num.put(3,"Python");
        System.out.println(num);
        System.out.println(num.keySet());
        System.out.println(num.entrySet());
        System.out.println(num.values());
    String value=num.remove(2);
        System.out.println(num);
}
}
