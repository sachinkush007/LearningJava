package com.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachLoop {
    public static void main(String[] args) {
        int i;
        List<Integer> list= new ArrayList<Integer>();
        for (i=0;i<10;i++) list.add(i);
        {
            System.out.println(list);
        }
        for (Integer e:list
             ) {
            System.out.println("Iterate List:"+e);
        }

        //Traverse Using Iterator

        Iterator<Integer> iterator=list.iterator();
        while(iterator.hasNext()){
            Integer newList=iterator.next();
            System.out.println(newList);
        }

//        traversing through forEach method of Iterable with anonymous class
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("forEach anonymous class Value::"+integer);
            }
        });

        //traversing with Consumer interface implementation

        MyConsumer myConsumer=new MyConsumer();
        list.forEach(myConsumer);
    }
}
