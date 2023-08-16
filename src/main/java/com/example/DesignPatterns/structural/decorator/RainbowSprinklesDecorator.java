package com.example.DesignPatterns.structural.decorator;

public  class RainbowSprinklesDecorator extends IcecreamDecorator {


    IceCream iceCream;


    RainbowSprinklesDecorator(IceCream iceCream){
        this.iceCream =iceCream;
    }

    @Override
    public String getDescription() {

        return iceCream.getDescription();
    }

    @Override
    int cost() {
        return this.iceCream.cost()+40;
    }
}
