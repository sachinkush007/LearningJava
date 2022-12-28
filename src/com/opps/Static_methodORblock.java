package com.opps;

public class Static_methodORblock {
    static String str="sachin";
    static int c;
    public static void show(){
        System.out.println("1 "+ str);
    }
    //static method access only static method or variable
    static void display(){
        System.out.println("------------");
        show();
    }
    static {
        int a=10,b=20;
         c=a+b;
    }
    public static void main(String[] args){
        System.out.println(c);
        Static_methodORblock s=new Static_methodORblock();
        s.show();
        System.out.println("----method call to create obj----");
        Static_methodORblock.show();
        Static_methodORblock.display();
    }
}
