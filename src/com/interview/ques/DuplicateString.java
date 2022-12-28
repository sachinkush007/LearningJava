package com.interview.ques;

public class DuplicateString {
    public static void main(String[] args){
        String s="abcdab";// Basically its work only two duplicates not more than two
        //where in this string there are two (a)'s so its work
        char c[]=s.toCharArray();
        int count =1;
        for (int i=0;i<s.length();i++)
        {
            for (int j=i+1;j<s.length();j++){
                if(c[i]==c[j])
                {
                    count++;
                    //c[j]='0';
                    System.out.println("Duplicate is: "+ c[j]);
                    if(count>1){
                        System.out.println("Duplicate repeats: "+ count+ " times");
                        count=1;
                    }
                }
            }

        }
    }
}
