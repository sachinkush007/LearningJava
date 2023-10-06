package com.java8;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;

public class LambdaExpr {

    //    Without LambdaExpr
    public static int add(int a, int b) {
        return a + b;
    }

    //     (x,y)->{System.out.println(x+y);}
    public static void main(String[] args) {
        int result = LambdaExpr.add(1, 2);
        System.out.println("Simple ADD: "+result);

        BiConsumer<Integer, Integer> myFun = (x, y) -> {
            System.out.println("LAMBDA ADD:"+x + y);
        };
        myFun.accept(2,3);

        MyInterface myInterface=(x,y)->{
            System.out.println(x+y);
        };

        myInterface.add(2,5);
        ArrayList<Integer> number= new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);

        AtomicInteger sum= new AtomicInteger();
        number.forEach((Integer n)->{
            System.out.println(n);
        });

        number.forEach(n -> sum.addAndGet(n));
        System.out.println(sum.get());
    }

}



