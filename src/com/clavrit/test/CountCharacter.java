package com.clavrit.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sc.nextLine();
        char[] uni = str.toCharArray();
        int size=uni.length;
         int i=0;
        Map<Character,Integer> map=new LinkedHashMap<>();
//        while (i!=size){
//            if(!map.containsKey(uni[i])){
//                map.put(uni[i],1);
//            }
//            else {
//                int oldval=map.get(uni[i]);
//                int newval=oldval+1;
//                map.put(uni[i],newval);
//            }
//            i++;
        for (Character s:uni) {
        int occurrences=map.getOrDefault(s,0)+1;
        map.put(s,occurrences);
        }
        Set<Map.Entry<Character,Integer>>hmap=map.entrySet();
        for (Map.Entry<Character,Integer>data:hmap){
            System.out.println(data.getKey()+" : --> "+data.getValue()+" times");
        }

    }
}
