package com.example.DesignPatterns.creational.prototype;

public class Car extends Vehicle{

    Integer average;

    public Car(Car car) {
        super(car);
        this.average = car.average;
    }

    public Car() {

    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }
}
