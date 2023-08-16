package com.example.DesignPatterns.structural.decorator;

public class ButterScotchIcecream extends IceCream {

    @Override
    int cost()
    {
        return 70;
    }

    @Override
    public String getDescription() {
        return "Butter Scotch";
    }
}
