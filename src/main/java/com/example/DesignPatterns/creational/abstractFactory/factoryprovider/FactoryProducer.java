package com.example.DesignPatterns.creational.abstractFactory.factoryprovider;

import com.example.DesignPatterns.creational.abstractFactory.abstractclasses.AbstractFactory;
import com.example.DesignPatterns.creational.abstractFactory.factories.RoundedShapeFactory;
import com.example.DesignPatterns.creational.abstractFactory.factories.ShapeFactory;

public class FactoryProducer {
    public  static  AbstractFactory  getFactory(boolean rounded){

        if(rounded){
            return new RoundedShapeFactory();
        }else{
            return new ShapeFactory();
        }
    }
}
