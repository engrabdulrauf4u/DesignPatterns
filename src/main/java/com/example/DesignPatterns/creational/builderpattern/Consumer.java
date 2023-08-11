package com.example.DesignPatterns.creational.builderpattern;

import com.example.DesignPatterns.creational.builderpattern.builder.Cook;
import com.example.DesignPatterns.creational.builderpattern.concretebuilder.ItalianCook;
import com.example.DesignPatterns.creational.builderpattern.concretebuilder.MexicanCook;
import com.example.DesignPatterns.creational.builderpattern.director.HeadChef;
import com.example.DesignPatterns.creational.builderpattern.finalObject.Pizza;
import org.hibernate.metamodel.internal.JpaStaticMetaModelPopulationSetting;

public class Consumer {
    public static void main(String[] args) {

        //Italian Pizza
        System.out.println("Italian Pizza.................");
        Cook cook=new ItalianCook();
        HeadChef chef = new HeadChef(cook);
        chef.makePizza();
        Pizza italianPizza = cook.getPizza();

        italianPizza.showPizza();

        //Mexican Pizza
        System.out.println("Mexican Pizza.................");
        Cook mexicanCook=new MexicanCook();
        HeadChef mexicanchef = new HeadChef(mexicanCook);
        mexicanchef.makePizza();
        Pizza mexicanPizza = mexicanCook.getPizza();

        mexicanPizza.showPizza();
    }
}