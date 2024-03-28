package com.java8;
@FunctionalInterface
public interface Child {
    public String show();

    default void hello(){}
}
