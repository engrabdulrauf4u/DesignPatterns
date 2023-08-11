package com.example.DesignPatterns.creational.singleton;

/*
* Ensure a class has only one instance, and provide a global point of access to it.
*
*/

public class SingletonPatternDemo {
    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        SingleObject object = new SingleObject();


        //Get the only object available
       //SingleObject object = SingleObject.getInstance();

        //show the message
        object.showMessage();



        SingleObject object1 = SingleObject.getInstance();

        //show the message
        object1.showMessage();

    }
}
