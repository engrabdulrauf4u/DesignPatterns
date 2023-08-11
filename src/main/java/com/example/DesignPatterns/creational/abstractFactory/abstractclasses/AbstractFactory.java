package com.example.DesignPatterns.creational.abstractFactory.abstractclasses;

import com.example.DesignPatterns.creational.abstractFactory.interfaces.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType);
}
