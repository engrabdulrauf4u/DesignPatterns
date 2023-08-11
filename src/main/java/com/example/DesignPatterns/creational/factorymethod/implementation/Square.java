package com.example.DesignPatterns.creational.factorymethod.implementation;

import com.example.DesignPatterns.creational.factorymethod.interfaces.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
