package com.clavrit.test;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class UniqueCharacter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=sc.nextLine();
        char[] uni = str.toCharArray();
        int i=0;
        int size=uni.length;
        Map<Character,Integer> map=new TreeMap<>();
        while (i!=size){
            if(map.containsKey(uni[i])==false){
                map.put(uni[i],1);
            }
            else {
                int oldval=map.get(uni[i]);
                int newval=oldval+1;
                map.put(uni[i],newval);
            }
            i++;
        }
        Set<Map.Entry<Character,Integer>>hmap=map.entrySet();
        for (Map.Entry<Character,Integer>data:hmap){
            if(data.getValue()==1){
                System.out.println(data.getKey());
            }
        }
    }
}
