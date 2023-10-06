package com.clavrit.test;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sc.nextLine();
        System.out.println("Enter which char you want to count:");
        String want=sc.nextLine();
//        System.out.println(want);
        String[] temp =str.split("");
        String t="";
        int count=0;
        for(int i=0;i<temp.length;i++){

            System.out.println(want.equals(temp[i]));
            if(want.equals(temp[i])){
                count++;

            }
        }
        System.out.println("Length"+temp.length);
        System.out.println(want+ " occurs "+count +" times");

    }
}
