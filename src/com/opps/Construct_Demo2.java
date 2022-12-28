package com.opps;

public class Construct_Demo2 {
        /* int x;
         int y;  // we can use this format also
         String s;*/
         int sum;
        public Construct_Demo2(String s, int x, int y)
        {

            //this.x=x;
            //this.y=y;
            sum=x+y;
            System.out.println(s+ "'s Salary Sum is: "+ sum);
        }
        public Construct_Demo2()
        {
            System.out.println("Constructor overloading");
        }
        public static void main(String[] args)
        {
            Construct_Demo2 d=new Construct_Demo2("Sachin",100,80);
            Construct_Demo2 d2=new Construct_Demo2();
        }
}
