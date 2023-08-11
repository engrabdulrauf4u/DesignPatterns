package com.example.DesignPatterns.creational.builderpattern.concretebuilder;

import com.example.DesignPatterns.creational.builderpattern.builder.Cook;
import com.example.DesignPatterns.creational.builderpattern.finalObject.Pizza;

public class MexicanCook implements Cook {

    private Pizza pizza;

    public MexicanCook(){
        pizza = new Pizza();
    }

    @Override
    public void buildDough() {
        pizza.setDough("Mexican Dough.");
    }

    @Override
    public void buildBase() {
        pizza.setBase("Mexican Base.");
    }

    @Override
    public void buildToppings() {
        pizza.setToppings("Mexican Toppings.");
    }

    @Override
    public void buildSauce() {

        pizza.setSauce("Mexican Sauce");
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
