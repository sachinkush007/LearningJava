package com.interview.ques;

public class SumOfArray {
    public static void main(String[] args){
        int a[]={1,2,3,4,5,6,7,8};
        int sum=0;
        double avg;
        //for(int i=0;i< a.length;i++)
        //we can use For loop also sum=sum+a[i]
        for (int num:a) {
            sum += num;// sum=sum+a[i] for loop
        }
        System.out.println(sum);
        avg=(double)sum/(double)a.length;
        System.out.println(avg);
    }
}
