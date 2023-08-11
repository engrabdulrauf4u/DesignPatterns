package com.example.DesignPatterns.creational.prototype;

public class Bike extends Vehicle{

    Integer average;

    public Bike(Bike bike) {
        super(bike);
        this.average = bike.average;
    }

    public Bike() {

    }

    @Override
    public Vehicle clone() {
        return new Bike(this);
    }
}
