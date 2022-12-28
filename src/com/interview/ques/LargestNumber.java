package com.interview.ques;

public class LargestNumber {
    public static void main(String[] args){
        int a=3,b=9,c=6;
        if(a>b && a>c)
            System.out.println(a + " -> is the largest num");
        if(b>a && b>c)
            System.out.println(b + " -> is the largest num");
        if(c>a && c>b)
            System.out.println(c + " -> is the largest num");
    }
}
