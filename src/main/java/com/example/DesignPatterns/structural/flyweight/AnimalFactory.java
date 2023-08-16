package com.example.DesignPatterns.structural.flyweight;

public class AnimalFactory {

    static Animal getAnimal(String type){

        Animal a=null;

        if (type=="Cat"){
            a=new Cat();
            a.setName(type);
        }else if(type=="Dog"){
            a=new Dog();
            a.setName(type);
        }
        return a;
    }
}
