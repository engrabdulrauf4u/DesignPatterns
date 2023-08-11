package com.example.DesignPatterns.creational.objectpool;

public class SharedObject {


    boolean alreadyInUse = false;

    void methodA() {
        System.out.println("I am Method A");
    }

    void methodB() {
        System.out.println("I am Method B");
    }

    void reset() {

    }

    public boolean isAlreadyInUse() {
        return alreadyInUse;
    }

    public void setAlreadyInUse(boolean alreadyInUse) {
        this.alreadyInUse = alreadyInUse;
    }

}
