package com.opps;

public interface Interface_Demo {
    final int a=10;
    public abstract void show();

//    public static void main(String[] args) {
//        System.out.println(Interface_Demo.a);
//    }
}
class Test implements Interface_Demo{
   @Override
   public void show(){
       System.out.println("implementing method");
   }
   public static void main(String[] args){
       /*oops_concept.Interface_Demo i=new oops_concept.Interface_Demo() {
           @Override
           public void show() {
               System.out.println("we can not create object of interface ");
           }
       };*/
       Test t=new Test();
       t.show();
       System.out.println(Interface_Demo.a);
   }
}
