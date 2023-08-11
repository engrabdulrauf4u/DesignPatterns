package com.example.DesignPatterns.creational.abstractFactory.implementations;

import com.example.DesignPatterns.creational.abstractFactory.interfaces.Shape;

public class RoundedSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside RoundedSquare::draw() method.");
    }
}
