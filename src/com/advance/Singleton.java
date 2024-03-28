package com.advance;

public class Singleton {
    String s;
    public static Singleton singleton=null;
    public static Singleton getInstance(){
        if(singleton==null) {
            singleton = new Singleton();
        }
        return singleton;
    }
    private Singleton(){
        s="I am singleton class";
    }
    public static void main(String[] args) {
        Singleton x=Singleton.getInstance();
        Singleton y=Singleton.getInstance();

        System.out.println("Hashcode of x: "+x.hashCode());
        System.out.println("Hashcode of y: "+y.hashCode());


    }
}
