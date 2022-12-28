package com.opps;

public class This_Method {
    This_Method() {
        System.out.println("Parent class Constructor");
    }

    This_Method(int var) {
        this();
        System.out.println("int  Constructor");
    }

    This_Method(String var2) {
        this(20);
        System.out.println("String Constructor");
    }

    public void show() {
        System.out.println("parent class method");
    }

}
        class Sachin extends This_Method{
    public void show(){
       // this.show();
        System.out.println("child class method");
    }
   public void method(){
        show();
        this.show();
        super.show();

    }
            public static void main(String[] args) {
                This_Method t = new This_Method();
                System.out.println("----------");
                This_Method k = new This_Method(10);
                System.out.println("----------");
                This_Method j = new This_Method("sachin");
                System.out.println("----This keyword------");
                Sachin s=new Sachin();
                s.method();
            }
}
