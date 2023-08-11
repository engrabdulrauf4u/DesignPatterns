package com.example.DesignPatterns.structural.proxy;

public class ProxyClass extends RealObjectClass{

    @Override
    public void method(){

        System.out.println("I am proxy class and Let me authenticate request first...");


        System.out.println("Calling real method .....");
        super.method();
    }
}
