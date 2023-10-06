package com.exception;

public class Counter extends Exception{
    public static void main(String[] args) {
        int count = 0;
//        public void a() throw Exception{
            try {
                count++;
                try {
                    count++;
                } catch (Exception e) {
                    count++;

                }
            } catch (Exception e) {
                count++;
            }
        }
//    }
}
