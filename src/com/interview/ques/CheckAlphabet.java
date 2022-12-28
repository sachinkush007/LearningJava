package com.interview.ques;

public class CheckAlphabet {
    public static void main(String[] args){
        char c='b';
        if(c>='a' && c<='z') {
            System.out.println(c + " -> is a Alphabet");
        }
        else
        {
            System.out.println(c + " -> is not Alphabet");
        }
    }
}
