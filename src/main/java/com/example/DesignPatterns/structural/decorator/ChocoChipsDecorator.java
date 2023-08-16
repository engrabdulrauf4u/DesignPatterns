package com.example.DesignPatterns.structural.decorator;

public  class ChocoChipsDecorator extends IcecreamDecorator {

    IceCream iceCream;


    ChocoChipsDecorator(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public int cost() {
        return this.iceCream.cost()+20;
    }


    @Override
    public String getDescription() {

        return iceCream.getDescription();

    }
}
