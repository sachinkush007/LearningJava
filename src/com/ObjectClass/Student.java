package com.ObjectClass;

import java.util.Date;

public class Student {
    private String name;
    private int age;
    private Date dob;
    private float avg;
    private char gender;
    private long roll_num;
    private double percentage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public long getRoll_num() {
        return roll_num;
    }

    public void setRoll_num(long roll_num) {
        this.roll_num = roll_num;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    // Date today = Calendar.getInstance().getTime();
    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return this.getName().equals(s.getName())
                && this.getDob().equals(s.getDob())
                && this.getAge() == s.getAge()
                && this.getAvg() == s.getAvg()
                && this.getGender() == s.getGender()
                && this.getPercentage() == getPercentage()
                && this.getRoll_num() == getRoll_num();


    }
}
