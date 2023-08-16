package com.example.DesignPatterns.structural.decorator;

public class ChocolateIcecream extends IceCream {

    @Override
    int cost() {
        return 40;
    }

    @Override
    public String getDescription() {

        return "Chocolate Ice Cream";
    }
}
