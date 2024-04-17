package com.opps;

public class CopyConstructor {
    String name;
    int age;
    public final int var=10;
    CopyConstructor(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("default");
    }

    CopyConstructor(CopyConstructor constructor){
        this(constructor.name,constructor.age);
        System.out.println("copy "+name +" "+age);
    }

    public static void main(String[] args) {
        CopyConstructor copyConstructor=new CopyConstructor("Sachin",23);
        CopyConstructor copyConstructor1=new CopyConstructor(copyConstructor);

    }
}
