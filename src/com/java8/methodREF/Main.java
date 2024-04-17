package com.java8.methodREF;

public class Main {
//    public static String toUpperCase(String input) {
//        return input.toUpperCase();
//    }
    public static void main(String[] args) {
        Convertor convertor= input->input.toUpperCase(); // Lambda
        System.out.println(convertor.convert("Sachin"));

        Convertor convertor1=String::toUpperCase;     //Method Reference
        System.out.println(convertor1.convert("Kumar"));

    }
}
