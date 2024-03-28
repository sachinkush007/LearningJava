package com.multithreding;

public class PrintTest extends Thread {
    public void printThread(int n){
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread " + n + " is working...");
                try {
                    Thread.sleep(600);
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                }
            }
            System.out.println("-----------------------------------------------------------");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }
}

class Thread1 extends Thread{
    PrintTest printTest;
    Thread1(PrintTest p) { printTest = p; }

    public void run(){
        printTest.printThread(1);
    }

}
class Thread2 extends Thread{
    PrintTest printTest;
    Thread2(PrintTest p) { printTest = p; }

    public void run(){
        printTest.printThread(2);
    }

}

class Main{
    public static void main(String[] args) {
        PrintTest printTest=new PrintTest();
        Thread1 thread1=new Thread1(printTest);
        Thread2 thread2=new Thread2(printTest);

        thread1.start();
        thread2.start();
    }

}