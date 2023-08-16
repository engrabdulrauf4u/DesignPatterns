package com.example.DesignPatterns.structural.flyweight;

public class Cow implements Animal{
    private String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printAnimalAtributes() {
        System.out.println("Animal name is "+this.name);
        System.out.println("Number of eyes of Animal is "+CommonShareableClass.eyes);
        System.out.println("Number of nose of Animal  is "+CommonShareableClass.nose);
        System.out.println("Number of legs of Animal  is "+CommonShareableClass.legs);
        System.out.println("Number of tail of Animal  is "+CommonShareableClass.tail);

    }
}
