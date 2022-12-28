package com.multithreding;

public class Daemon_Thread extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("Child Thread: ->"+Thread.currentThread().getName());
        Thread.currentThread().setDaemon(true);
    }
}
class Daemon{
    public static void main(String[] args){
        //Thread.currentThread().setDaemon(true);//it is not possible bcs Thread is already created in main thread
        System.out.println("Main Thread: ->"+Thread.currentThread().getName());
        Daemon_Thread d=new Daemon_Thread();
        d.start();
        d.setPriority(3);
        //d.setDaemon(true);
    }
}
