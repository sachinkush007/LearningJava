package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        //1.Blank Stream
        Stream<Object> stream=Stream.empty();

        //2. Array,Object, collection
        String name[]={"Sachin","Akash","Anku"};

        Stream<String> stringStream=Stream.of(name);
        stringStream.forEach(e->{
            System.out.println("Array Stream: "+e);
        });
//        3. Arryas
        IntStream stream1 = Arrays.stream(new int[]{2, 3, 44, 56, 23, 2});
        stream1.forEach(i->{
            System.out.println("Int Stream: "+i);
        });

        List<Integer> list=List.of(123,335,634,6,34);
        list.stream().forEach(i->{
            System.out.println("List Stream: " +i);
        });

    }
}
