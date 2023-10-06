package com.java8;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<Integer> {
    @Override
    public void accept(Integer integer) {
        System.out.println("Consumer IMPL Value::"+integer);
    }
}
