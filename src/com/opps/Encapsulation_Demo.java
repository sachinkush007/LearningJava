package com.opps;

public class Encapsulation_Demo {
   // public static void main(String[] args){
        private int empid;
   // }
    public void setEmpid(int eid){
        empid=eid;
        System.out.println(empid);
    }
    public int getEmpid(){
        return empid;
    }
    public static void main(String[] args){
        Encapsulation_Demo e=new Encapsulation_Demo();
        e.setEmpid(12);
        System.out.println(e.getEmpid());
    }
}
