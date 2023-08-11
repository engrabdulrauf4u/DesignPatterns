package com.example.DesignPatterns.creational.builderpattern.concretebuilder;

import com.example.DesignPatterns.creational.builderpattern.builder.Cook;
import com.example.DesignPatterns.creational.builderpattern.finalObject.Pizza;

public class ItalianCook implements Cook {

    private Pizza pizza;

    public ItalianCook(){
        pizza = new Pizza();
    }

    @Override
    public void buildDough() {
        pizza.setDough("Italian Dough.");
    }

    @Override
    public void buildBase() {
        pizza.setBase("Italian Base.");
    }

    @Override
    public void buildToppings() {
        pizza.setToppings("Italian Toppings.");
    }

    @Override
    public void buildSauce() {

        pizza.setSauce("Italian Sauce");
    }

    @Override
    public void buildBake() {

        pizza.setBake("bake");
    }

    @Override
    public void buildCheese() {
        pizza.setCheese("Cheese");
    }

    @Override
    public Pizza getPizza() {
        Pizza finalPizza = this.pizza;
        this.pizza = new Pizza();
        return finalPizza;
    }
}
