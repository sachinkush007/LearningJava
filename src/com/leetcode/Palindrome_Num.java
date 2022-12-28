package com.leetcode;

public class Palindrome_Num {
    public boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        int start=0;
        int end=num.length()-1;
        while(start<=end){
            if(num.charAt(start) != num.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args){
         int x=121;
         Palindrome_Num p=new Palindrome_Num();
         System.out.println(p.isPalindrome(x));
    }
}
