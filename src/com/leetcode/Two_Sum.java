package com.leetcode;

public class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                    System.out.println("["+arr[0]+","+arr[1]+"]");
                    break;
                }
            }
        }
        return arr;

    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 17;
        //Two_Sum t = new Two_Sum();
       // t.twoSum(nums,target)
        for (int y:twoSum(nums,target))

            System.out.print(y+" ");

    }
}
