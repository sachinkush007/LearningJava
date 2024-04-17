package com.java8.lamda;

public class LambdaWithThread{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Runnable runnable=()->{
            for(int i=1;i<=10;i++){
                System.out.println("Hello "+i);

            }

        };
        Thread childThread=new Thread(runnable);
          childThread.start();
          Thread.currentThread().setName("custom");
        System.out.println(Thread.currentThread().getName());

    }
}
