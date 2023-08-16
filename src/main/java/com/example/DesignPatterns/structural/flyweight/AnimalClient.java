package com.example.DesignPatterns.structural.flyweight;

public class AnimalClient {
    public static void main(String[] args) {

        Animal animal1  = AnimalFactory.getAnimal("Cat");
        animal1.printAnimalAtributes();

        Animal animal2  = AnimalFactory.getAnimal("Dog");
        animal2.printAnimalAtributes();
    }
}
