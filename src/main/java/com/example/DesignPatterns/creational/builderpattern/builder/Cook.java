package com.example.DesignPatterns.creational.builderpattern.builder;

import com.example.DesignPatterns.creational.builderpattern.finalObject.Pizza;

public interface Cook {
    public void buildDough();
    public void buildBase();
    public void buildToppings();
    public void buildSauce();
    public void buildBake();
    public void buildCheese();
    public Pizza getPizza();
}
