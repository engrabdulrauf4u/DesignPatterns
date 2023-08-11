package com.example.DesignPatterns.creational.factorymethod.implementation;

import com.example.DesignPatterns.creational.factorymethod.interfaces.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
