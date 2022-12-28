package com.opps;

public class Inheritance_Demo {
    public void eat(){
        System.out.println("parent class method");
    }
}
class Child extends Inheritance_Demo
{
    public void run() {
        System.out.println("child class method");
    }
    public static void main(String[] args){
        Child c=new Child();
        c.eat();//if we don't extends the parent class than we create eat() personally for child class
        c.run();
    }

}
