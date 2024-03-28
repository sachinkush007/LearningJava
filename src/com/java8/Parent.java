package com.java8;
//@FunctionalInterface
public interface Parent {
    public void show();
    public default void hi(){
        System.out.println("Hi....");
    }
}
class Children implements Parent{

    @Override
    public void show() {
        System.out.println("hey show");
    }
}
class MyClass{
    public static void main(String[] args) {
        Parent myClass=new Children() {
            @Override
            public void show() {

            }
        };
        myClass.hi();
        myClass.show();
    }


}
