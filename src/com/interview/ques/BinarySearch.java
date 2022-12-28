package com.interview.ques;

public class BinarySearch {
    public static void main(String[] args){
        int arr[]={1,3,4,5,8,9,10,11};
        int find=10;
        int f=arr[0];
        int l=arr.length-1;
        int mid=(f+l)/2;
        while(f<=l)
        {
            if(arr[mid]==find)
            {
                System.out.println("element find on index num " + mid);
                break;
            }
            if(arr[mid]<find)
            {
                f=mid+1;
            }
            else{
                l=mid-1;
            }
            mid=(f+l)/2;
        }
        if(f>l)
        {
            System.out.println("item not found");
        }
    }
}
