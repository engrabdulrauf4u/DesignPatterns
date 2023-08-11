package com.example.DesignPatterns.creational.abstractFactory.factories;

import com.example.DesignPatterns.creational.abstractFactory.abstractclasses.AbstractFactory;
import com.example.DesignPatterns.creational.abstractFactory.implementations.Rectangle;
import com.example.DesignPatterns.creational.abstractFactory.implementations.Sqaure;
import com.example.DesignPatterns.creational.abstractFactory.interfaces.Shape;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Sqaure();
        }
        return null;
    }
}
