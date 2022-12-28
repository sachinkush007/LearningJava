package com.multithreding;

public class Using_Runnable_IF implements Runnable {
   // private String name;
   private String thread_name;
  public Using_Runnable_IF(String name){
       thread_name=name;
       System.out.println("Creating : "+thread_name+"->"+Thread.currentThread().getName());
   }
    @Override
    public void run() {
        System.out.println("Running : "+thread_name+"->"+Thread.currentThread().getName());
        for (int i=1;i<=5;i++){
            try {
                Thread.sleep(1000);
                System.out.println("THREAD :"+thread_name+","+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void start() {
        System.out.println("Starting : "+thread_name+"->"+Thread.currentThread().getName());
    }
}
class Runnable_int{
    public static void main(String[] args){
        Using_Runnable_IF u=new Using_Runnable_IF("thread 1");
       // Runnable_int r=new Runnable_int();
        u.start();
         Thread t=new Thread(u);
        t.start();
        Using_Runnable_IF u1=new Using_Runnable_IF("thread 2");
        Thread t2=new Thread(u1);
        t2.start();
        t2.setPriority(3);
    }

}
