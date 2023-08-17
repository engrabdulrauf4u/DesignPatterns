package com.example.DesignPatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Newsletter implements Subject{

    private final String name;
    protected List<Observer> observers = new ArrayList<>();
    protected String newEmail;


    public void addNewEmail(String newEmail) {
        this.newEmail = newEmail;
        notifysubscriber();
    }
    public Newsletter(String name) {
        this.name = name;
    }
    
    @Override
    public void addsubscriber(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removesubscriber(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifysubscriber() {

        observers.forEach(observer -> observer.update(newEmail));
    }
}
