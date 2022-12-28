package com.exception;

public class TestException {
    public static void main(String[] args) {
        try {
            int a = 40 / 0;
        } //catch (ArithmeticException e) {
        //  System.out.println("already caught");}
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("airthmatic exception");
        }
        //catch (ArithmeticException e){
        finally {
            System.out.println("'Try catch' is finished");
        }
        System.out.println("Exception already caught");


    }
}
