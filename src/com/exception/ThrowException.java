package com.exception;

import java.util.Scanner;

public class ThrowException extends RuntimeException{
    public static void main(String[] args){ //throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER age:");
        int age=sc.nextInt();
        if(age<=18){
            try {
                throw new Exception("you are not eligible");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("YOu Are Eligible");
        }
    }
}
