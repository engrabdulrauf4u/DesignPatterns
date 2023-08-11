package com.example.DesignPatterns.creational.builderpattern.director;

import com.example.DesignPatterns.creational.builderpattern.builder.Cook;
import org.springframework.aop.scope.ScopedObject;

public class HeadChef {

    private Cook cook;

    public HeadChef(Cook cook){
        this.cook = cook;
    }
    public void makePizza(){
        cook.buildDough();
        cook.buildBase();
        cook.buildToppings();
        cook.buildSauce();
        cook.buildBake();
        cook.buildCheese();

    }
}
