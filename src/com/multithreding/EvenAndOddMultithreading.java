package com.multithreding;

public class EvenAndOddMultithreading implements Runnable {

    int count = 1;
    final Object object;
    String str;

    public EvenAndOddMultithreading(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            synchronized (object) {
                if (i % 2 == 0 && Thread.currentThread().getName().equals("even")) {
                    System.out.println("Thread Name: " + Thread.currentThread().getName() + " Value " + i);
//                    try {
//                        object.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                }
                if (i % 2 != 0 && Thread.currentThread().getName().equals("Odd")) {
                    System.out.println("Thread Name: " + Thread.currentThread().getName() + "  Value " + i);
//                    object.notify();
                }
            }
        }
    }


    public static void main(String[] args) {
        Object lock = new Object();
        EvenAndOddMultithreading multithreading = new EvenAndOddMultithreading(lock);
        EvenAndOddMultithreading multiThreading2 = new EvenAndOddMultithreading(lock);
        new Thread(multithreading, "even").start();
        new Thread(multiThreading2, "Odd").start();
    }
}
