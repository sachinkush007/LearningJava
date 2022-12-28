package com.opps;

public class Overriding_Demo {
    public void show(){
        System.out.println("parent class method");
    }

}
class Demo extends Overriding_Demo {
    public  void show(){

        System.out.println("Child class method");
    }
    public static void main(String[] args){
        Demo d=new Demo();
        d.show();
        d.show();
    }
}
