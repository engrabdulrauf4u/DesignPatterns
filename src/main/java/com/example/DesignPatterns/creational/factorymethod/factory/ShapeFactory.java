package com.example.DesignPatterns.creational.factorymethod.factory;

import com.example.DesignPatterns.creational.factorymethod.implementation.Circle;
import com.example.DesignPatterns.creational.factorymethod.implementation.Rectangle;
import com.example.DesignPatterns.creational.factorymethod.implementation.Square;
import com.example.DesignPatterns.creational.factorymethod.interfaces.Shape;

public class ShapeFactory {
    //use getShape method to get object of type shape
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}
