package com.opps;

public class Static_Keyword {
    static int var = 10;
    int a=5;
   void show(){
      // static int var2;
       System.out.println(var);
       System.out.println(a);

    }
    public static void main(String[] args) {
     Static_Keyword st=new Static_Keyword();
//        st.var;
        System.out.println(Static_Keyword.var);
        st.show();

    }
}
