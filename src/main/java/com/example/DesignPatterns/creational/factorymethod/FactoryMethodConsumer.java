package com.example.DesignPatterns.creational.factorymethod;

import com.example.DesignPatterns.creational.factorymethod.factory.ShapeFactory;
import com.example.DesignPatterns.creational.factorymethod.interfaces.Shape;

public class FactoryMethodConsumer {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Circle
        shape1.draw();

    }
}
