package com.clavrit.test;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        int count=0;
        int i;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number:");
        int n=sc.nextInt();
        while (n!=0){
           n=n/10;
           count++;
        }
        System.out.println(count);
    }
}
