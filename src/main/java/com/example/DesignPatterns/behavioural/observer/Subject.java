package com.example.DesignPatterns.behavioural.observer;

public interface Subject {

    void addsubscriber(Observer observer);
    void removesubscriber(Observer observer);
    void notifysubscriber();

}
