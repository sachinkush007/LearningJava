package com.interview.ques_2.O;

import java.io.Serializable;

public class ReverseString implements Serializable {

    public static void main(String[] args) {
        String str = "Sachin";
        String reverse = "";

        int size = str.length();
        for(int i=size-1;i>=0;i--){
           reverse=reverse+str.charAt(i);
        }
        System.out.println("Reverse String: "+reverse);

        if(str.equals(reverse)){
            System.out.println(str+" String is palindrome");
        }
        else{
            System.out.println(str+" String is not palindrome");
        }
    }

}
