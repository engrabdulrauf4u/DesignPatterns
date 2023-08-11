package com.example.DesignPatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class ShowRoom {

    static List<Vehicle> originalObjects =  new ArrayList<Vehicle>();
    static List<Vehicle> clonedObjects =  new ArrayList<Vehicle>();


    public ShowRoom(){

        Car c1 = new Car();
        c1.seats = 5;
        c1.tyres = 4;
        c1.color = "white";
        c1.fuel = "petrol";
        c1.average = 15;
        originalObjects.add(c1);



        Bike b1 = new Bike();
        b1.seats = 1;
        b1.tyres = 2;
        b1.color = "black";
        b1.fuel = "petrol";
        b1.average = 50;
        originalObjects.add(b1);
    }
    public static void main(String[] args) {

        // cloning each object of 'vehiles' list
       ShowRoom showroom=new ShowRoom();

        for (Vehicle vehicle : originalObjects) {
            clonedObjects.add(vehicle.clone());
        }

        //Original Object prints

        System.out.print("Original Objects:-\n");
        for (Vehicle vehicle : originalObjects) { // Printing Original objects
            System.out.println(vehicle.toString());
            System.out.println("---------------------------------------------------------");
        }

        //Cloned Objects Prints
        System.out.print("\n\n\nPrototyped Objects:-\n");
        for (Vehicle vehicle : clonedObjects) { // Printing cloned objects
            System.out.println(vehicle.toString());
            System.out.println("---------------------------------------------------------");
        }

    }
}