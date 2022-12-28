package com.containsOrNot;

public class Animal implements Comparable{
    private String name;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public Animal(String name, String color, int id) {
        this.name = name;
        this.color = color;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String color;
    private int id;

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
