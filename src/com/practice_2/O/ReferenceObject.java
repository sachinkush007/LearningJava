package com.practice_2.O;

import com.multithreding.A;

import java.util.Arrays;

public class ReferenceObject {
    public static void main(String[] args) {
        int[] a = {1,8,4,9,5,3};
        int[] b=a;

        System.out.println("This is Reference Object");
        System.out.println("Array A: "+ Arrays.toString(a));
        System.out.println("Array B: "+Arrays.toString(b));

        System.out.println("******************************************************");
        b[1]=10;

        System.out.println("Array A: "+ Arrays.toString(a));
        System.out.println("Array B: "+Arrays.toString(b));
        System.out.println("****** Sort Array ******");
        Arrays.sort(a);
        System.out.println("Sort Array"+ Arrays.toString(a));

    }
}
