package com.opps;

class Parent2{
    public static void display() {
        System.out.println("Static or class method from Parent");
    }
    public void hi(){
        System.out.println("Parent Hi");
    }
}
class Child2 extends Parent2{
    public static void display() {
        System.out.println("Static or class method from Child");
    }
    public void hi(){
        System.out.println("Child Hi");
    }
}

public class StaticOverride {
    public static void main(String[] args) {
        Parent2 child2= new Child2();
        child2.hi();
        child2.display();
    }


}

