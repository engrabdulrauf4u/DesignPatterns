package com.example.DesignPatterns.creational.builderpattern.finalObject;

public class Pizza {

    public String dough;
    public String base;
    public String toppings;
    public String sauce;
    public String bake;
    public String cheese;

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setBake(String bake) {
        this.bake = bake;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void showPizza(){
        System.out.println("-Dough : "+dough+"\n-Base:  "+base+ "\n-Toppings : "+toppings+"\n-Sauce :  "+sauce+"\n-Bake : "+bake+"\n-Cheese : "+cheese);
    }

}
