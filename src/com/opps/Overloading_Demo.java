package com.opps;

public class Overloading_Demo {
    public void show()
    {
        System.out.println(" Method Overloading");
    }
    protected void show(int x, String s)
    {
        System.out.println(x+" : "+s);
    }
    public static void main(String [] args)
    {
        Overloading_Demo o=new Overloading_Demo();
        o.show();
        o.show(22 ,"sachin");
    }
}
