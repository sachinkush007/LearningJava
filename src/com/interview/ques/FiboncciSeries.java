package com.interview.ques;

public class FiboncciSeries {
    public static void main(String[] args){
        int firsTerm=0,secondTerm=1;
        int n=10;
        System.out.println("Fibonacci Series till " + n + " terms:");
        for(int i=1;i<=n;i++){
            System.out.print(firsTerm+ " ");
            int nextTerm=firsTerm+secondTerm;
            firsTerm=secondTerm;
            secondTerm=nextTerm;
            // System.out.println(firsTerm);

        }
    }
}
