package com.example.DesignPatterns.behavioural.observer;

public class Subscriber implements Observer{

    String name;

    public Subscriber(String name) {
        this.name = name;
    }
    @Override
    public void update(String newEmail) {
        System.out.println("Email for: " + name + " | Content:" + newEmail);

    }
}
