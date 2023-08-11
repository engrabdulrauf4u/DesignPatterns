package com.example.DesignPatterns.creational.abstractFactory.factories;

import com.example.DesignPatterns.creational.abstractFactory.abstractclasses.AbstractFactory;
import com.example.DesignPatterns.creational.abstractFactory.implementations.RoundedRectangle;
import com.example.DesignPatterns.creational.abstractFactory.implementations.RoundedSquare;
import com.example.DesignPatterns.creational.abstractFactory.interfaces.Shape;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new RoundedSquare();
        }
        return null;
    }
}
