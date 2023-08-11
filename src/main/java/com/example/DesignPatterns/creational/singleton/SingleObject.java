package com.example.DesignPatterns.creational.singleton;

public class SingleObject {

    private static SingleObject singleObject;

    protected SingleObject(){

    }

    public static SingleObject getInstance(){
        if(singleObject==null){
            System.out.println("Object Created ");
            singleObject = new SingleObject();
        }
        return singleObject;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
