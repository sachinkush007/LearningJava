package com.multithreding;

public class A extends Thread{
    @Override
    public void run() {
       System.out.println("world");
    }
    public void xyz()
    {
        System.out.println("zero");
    }

    public static void main(String[] args) {
        A a=new A();
        a.start();
        a.run();
        a.xyz();
    }
}
