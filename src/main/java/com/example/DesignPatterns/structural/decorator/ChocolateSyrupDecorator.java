package com.example.DesignPatterns.structural.decorator;

public  class ChocolateSyrupDecorator extends IcecreamDecorator {

    IceCream iceCream;


    ChocolateSyrupDecorator(IceCream iceCream){

        this.iceCream = iceCream;
    }


    @Override
    public String getDescription() {

        return iceCream.getDescription();
    }

    @Override
    int cost() {
         return this.iceCream.cost()+30;
    }
}
