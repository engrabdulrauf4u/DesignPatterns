package com.example.DesignPatterns.creational.factorymethod.implementation;

import com.example.DesignPatterns.creational.factorymethod.interfaces.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
