package com.pattern;

public class P1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(i + 1);// j+1-> 12345 pattern

                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
