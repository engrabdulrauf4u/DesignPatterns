package com.example.DesignPatterns.structural.decorator;

/**
 *  Changing the behaviour of object .
 *  Wrapping the object outside the original object
 *
 */
public class DecoratorMain {
    public static void main(String[] args) {

        IceCream butterScotchIcecream =new ButterScotchIcecream();

        System.out.println("Values before decorator \n cost "+butterScotchIcecream.cost()+" \n Description "+butterScotchIcecream.getDescription() );

        ChocoChipsDecorator chocoChipsDecorator = new ChocoChipsDecorator(butterScotchIcecream);

        System.out.println("Values after choco chips decorator \n cost "+chocoChipsDecorator.cost()+" \n Description "+chocoChipsDecorator.getDescription() );


        ChocolateSyrupDecorator chocolateSyrupDecorator = new ChocolateSyrupDecorator(chocoChipsDecorator);

        System.out.println("Values after chocolate Syrup decorator \n cost "+chocolateSyrupDecorator.cost()+" \n Description "+chocolateSyrupDecorator.getDescription() );


    }
}
