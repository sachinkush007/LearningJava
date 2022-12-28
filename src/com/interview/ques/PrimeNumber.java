package com.interview.ques;

public class PrimeNumber {
    public static void main(String[] args){
        int no=29;
        int temp=0;
        for(int i=2;i<=no-1;i++) {
            if(no%i==0){
                temp=temp+1;
            }
        }
        if(temp>0){
            System.out.println(no +" No is not prime");
        }
        else {
            System.out.println(no+ " No is prime");
        }
    }
}
