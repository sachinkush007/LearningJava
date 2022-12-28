package com.interview.ques;

public class SortArray {
    public static void main(String[] args) {
        // int a[] = {5, 2, 6, 1, 9, 0, 4};
        String[] a={"sachin","akash","anku","purvi","gayu","himanshi","navyansh"};
        //int temp;
        for (int i = 0; i <a.length; i++)
        {
            for (int j = 0; j<a.length-1-i; j++)
            {
                //if (a[j] > a[j+1])
                if(a[j].compareTo(a[j+1])>0)//for String
                {
                    String temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
    }
}
