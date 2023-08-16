package com.example.DesignPatterns.structural.decorator;

public abstract class IceCream {

    private String description;
    abstract int cost();

    String getDescription() {
         return  description;
     }

}
