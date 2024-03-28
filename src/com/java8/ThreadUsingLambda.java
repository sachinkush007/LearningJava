package com.java8;

public class ThreadUsingLambda{
//    @Override
//    public void run() {
//        for(int i=1;i<=5;i++){
//            System.out.println("Hello Thread: "+ i);
//        }
//    }

    public static void main(String[] args) {
//        ThreadUsingLambda usingLambda=new ThreadUsingLambda();
        Runnable runnable=()->{
            for(int i=1;i<=5;i++){
                System.out.println("Hello Thread: "+ i);
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();
//        for(int i=1;i<=5;i++){
//            System.out.println("Bye Thread: "+ i);
//        }
    }
}
