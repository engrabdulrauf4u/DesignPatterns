package com.example.DesignPatterns.creational.abstractFactory;

import com.example.DesignPatterns.creational.abstractFactory.abstractclasses.AbstractFactory;
import com.example.DesignPatterns.creational.abstractFactory.factoryprovider.FactoryProducer;
import com.example.DesignPatterns.creational.abstractFactory.interfaces.Shape;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {


        AbstractFactory factory = FactoryProducer.getFactory(false);
        Shape shape = factory.getShape("RECTANGLE");
        shape.draw();
    }
}
