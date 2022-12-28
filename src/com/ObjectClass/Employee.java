package com.ObjectClass;

public class Employee {
    public Employee(String s) {
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("sachin");
        Employee emp2 = new Employee("sachin");
        // Object_Class eq3=eq1;
        Employee eq3 = new Employee("kumar");
        eq3 = emp1;

        String str1 = new String("sachin");
        String str2 = new String("kumar");

        System.out.println(emp1.equals(emp2));
        System.out.println(emp1.equals(eq3));
        System.out.println(str1.equals(str2));

        System.out.println(emp1);
        System.out.println(emp1.toString());

        System.out.println(str1);
        System.out.println(str1.toString());

        System.out.println(emp1.hashCode());
        System.out.println(str1.hashCode());
    }
}
