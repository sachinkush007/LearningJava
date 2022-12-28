package com.opps;

public class for_each_loop {
    public static void main(String[] args){
        int a[]={1,2,3,4,5,6,7,8};
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("*********************");
        for (int data:a) {
            System.out.println(data);
        }
    }
}
