package com.interview.ques;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,2,4};
        //System.out.println(arr[j]);
        Set<Integer> s=new HashSet<Integer>();
        for (int num:arr) {
            boolean b=s.add(num);
            if(b==false){
                System.out.println(num);
            }
        }
        System.out.println(s);
    }
}
