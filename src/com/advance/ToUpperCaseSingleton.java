package com.advance;

public class ToUpperCaseSingleton {

    String s;
    static ToUpperCaseSingleton singleton=null;
    static synchronized  ToUpperCaseSingleton getInstance(){
        if(singleton==null){
            singleton=new ToUpperCaseSingleton();
        }
        return singleton;
    }
    private ToUpperCaseSingleton(){
        s="This is a singleton class";
    }

}
class Main{
    public static void main(String[] args) {
        ToUpperCaseSingleton x=ToUpperCaseSingleton.getInstance();
        ToUpperCaseSingleton y=ToUpperCaseSingleton.getInstance();

        x.s=(x.s).toUpperCase();
        y.s=(y.s).toUpperCase();

        System.out.println("String from x: "+x.s);
        System.out.println("String from y: "+y.s);


    }
}
