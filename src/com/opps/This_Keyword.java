package com.opps;

public class This_Keyword {
    int i;
    public void set_value(int i){
        this.i=i;
    }
      public void set_value(){

    }
    void show(){
        System.out.println(i);
    }
    public static void main(String[] args){
       This_Keyword t=new This_Keyword();
       t.set_value(10);
       t.show();
    }
}
