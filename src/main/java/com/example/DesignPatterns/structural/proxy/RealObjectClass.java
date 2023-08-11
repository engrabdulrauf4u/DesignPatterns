package com.example.DesignPatterns.structural.proxy;

public class RealObjectClass implements Subject {
    @Override
    public void method() {
        System.out.println("I am actual implementation of Subject.....rest all re proxies...");
    }
}
