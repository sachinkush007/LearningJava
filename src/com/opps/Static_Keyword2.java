package com.opps;

public class Static_Keyword2 {
    int id=1;
    String name;
     static String company="TCS";
    Static_Keyword2(int id,String name){
        this.id=id;
        this.name=name;
        System.out.println("id is: "+id+" name is: "+name+" company is: "+ company);
    }
}
class Sta extends Static_Keyword2{
     Sta(int id, String name) {
        super(id, name);
    }

    public static void main(String [] args){
            Static_Keyword2 st=new Static_Keyword2(101,"Sachin");
            Static_Keyword2 st2=new Static_Keyword2(102,"akash");
            Sta st3= new Sta(103,"anku");
        }
}
