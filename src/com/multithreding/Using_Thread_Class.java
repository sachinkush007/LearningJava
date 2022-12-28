package com.multithreding;

public class Using_Thread_Class extends Thread{
    String threadName;
    public Using_Thread_Class(String name){
       threadName=name;
       System.out.println("creating Thread -> "+threadName +" "+Thread.currentThread().getName());
    }
    @Override
    public void run() {
        //super.run();
        System.out.println("running Thread -> "+threadName +" "+Thread.currentThread().getName());
    }
    //public void start(){
     //   System.out.println("starting thread -> "+threadName);
   // }
    public static void main(String[] args){
        Using_Thread_Class u=new Using_Thread_Class("thread-1");
        u.start();
        System.out.println("start thread-1 is here");
        Using_Thread_Class u1= new Using_Thread_Class("thread-2");
        u1.start();
        System.out.println("start thread-2 is here");
    }
}
