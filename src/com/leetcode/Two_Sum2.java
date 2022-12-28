package com.leetcode;

public class Two_Sum2 {
    static int[] targetSum(int[] a, int target) {
        int arr[] = new int[2];
        int left = 0, right = a.length - 1, tempSum;
        while (left <= right) {
            tempSum = a[left] + a[right];
            if (tempSum == target) {
                //return new int[]{left,right};
                arr[0] = left;
                arr[1] = right;
                return arr;
            }
            if (tempSum > target)
                right--;
            else
                left++;
        }
       // return new int[]{-1 , -1};
    return arr;
}
        public static void main(String args[])
        {
            int [] a = {1 , 4 , 5 , 11 , 12};
            int target = 23;
           // Two_Sum2 t2=new Two_Sum2();
           // t2.targetSum(a,target);
           //for(int x : targetSum(a , target))
            for (int x:targetSum(a,target)) {
                System.out.print(x + " ");
            }

        }
    }

