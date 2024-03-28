package com.advance;

public class ConstructorChaining {

//Using this() method.
    ConstructorChaining(){

        System.out.println("default constructor");
    }
    ConstructorChaining(int x){
        this();
        System.out.println(x);
    }

    ConstructorChaining(int x,int y){
        this(5);
        System.out.println(x*y);
    }
    public static void main(String[] args) {
       ConstructorChaining chaining= new ConstructorChaining(2,4);
    }
}
