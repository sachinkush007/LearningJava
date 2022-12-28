package com.ObjectClass;

import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date today = Calendar.getInstance().getTime();
        Student s1 = new Student();
        Student s2 = new Student();

        s1.setName("sachin");
        s2.setName("sachin");
//s1.today.setTime(00);
        s1.setDob(today);
        s2.setDob(today);
        s1.setAge(22);
        s2.setAge(22);
        s1.setAvg(0.5F);
        s2.setAvg(0.5F);
        s1.setGender('M');
        s2.setGender('M');
        s1.setPercentage(95.5);
        s2.setPercentage(95.5);
        s1.setRoll_num(12345);
        s2.setRoll_num(12345);

        System.out.println(today);

        System.out.println(s1.equals(s2));
        // System.out.println(s1.equals(s2));

    }
}
