package com.interview.ques;

import java.util.HashSet;

public class FindValueInArray {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 9, 1, 6, 5, 8, 3};
        int n = 5;
        int index = -1;
        HashSet<Integer> hashSet = new HashSet<Integer>();
        int currentIndex = 0;

//        for (int i = 0; i < arr.length; i++) {
//            hashSet.add(arr[i]);
//            if (arr[i] == n) {
//                index = i; // Update the index when the number is found
//                break; // No need to continue searching
//            }
//        }

        for (Integer i : arr) {
            hashSet.add(i);
            if (i == n) {
                index = currentIndex;
                break;
            }
            currentIndex++;
        }
        if (index != -1) {
            System.out.println(n + " is found at index " + index + " in the array.");
        } else {
            System.out.println(n + " is not found in the array.");

        }
//        if(hashSet.contains(n)){
//            System.out.println(n + " is found in the array.");
//        } else {
//            System.out.println(n + " is not found in the array.");
//        }
    }

}
