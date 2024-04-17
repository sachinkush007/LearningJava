package com.java8.lamda;

public class Main {
    public static void main(String[] args) {
//        Employee employee=new SoftwareEngineer();
//        System.out.println( employee.getName());

        Employee employee=()-> {
//            public String getName() {
                return "Hey Lambda";
//            }
        };
        System.out.println(employee.getName());
    }
}
