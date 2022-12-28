package com.opps;

public abstract class Abstract_Demo {

    abstract void start();
    void run(){
        System.out.println("abstract class can have non abstract method also");
    }
}
class Car extends Abstract_Demo{
    void start(){
        System.out.println("Car start with KEY");
    }
}
class Scooter extends Abstract_Demo
{
    void start(){
        System.out.println("Scooter start with KICk");
    }
    public static void main(String[] args){
       // Abstract_Demo a=new Abstract_Demo();//Abstract_Demo' is abstract; cannot be instantiated
       /* {
            @Override
            void start() {
                System.out.println("if we override at Create object");
            }
        };*/
        //a.start();
        Scooter s=new Scooter();
        s.start();
        Car c=new Car();
        c.start();
        c.run();

    }
}
