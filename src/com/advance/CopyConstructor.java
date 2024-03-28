package com.advance;

public class CopyConstructor {

    public static void main(String[] args) {
        Car car=new Car("Toyota", "Camry");
        Car copyCar= new Car(car);
        Car car1=copyCar;
        System.out.println(car1);
    }
}
class Car{
    String brand;
    String model;
    Car(String brand,String model){
        this.brand=brand;
        this.model=model;
        System.out.println("simple constructor");
    }
    Car(Car car){
        this.brand=car.brand;
        this.model=car.model;
        System.out.println("Copy constructor");
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
