package com.opps;

public class Superclass {

    int num , age;
    Superclass(int num,int age){
        this.num=num;
        this.age=age;
        System.out.println(num + age);
    }
    Superclass(int num){

    }
}
class Subclass extends Superclass{
    int age;
   private Subclass(int num, int age){
        super(num,age);
        this.age=age;

        System.out.println(age);
    }

    public static void main(String[] args) {
        Subclass subclass=new Subclass(10,20);

    }
}
