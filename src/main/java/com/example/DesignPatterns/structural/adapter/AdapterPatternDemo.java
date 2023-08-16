package com.example.DesignPatterns.structural.adapter;

import com.example.DesignPatterns.structural.adapter.concretes.GalleryApp;

/*
An Adapter pattern acts as a connector between two incompatible interfaces that otherwise cannot be connected directly.
The main goal for this pattern is to convert an existing interface into another one the client expects
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        GalleryApp gallery = new GalleryApp();

        gallery.show("jpeg", "naruto.jpeg");
        gallery.show("png", "sasuke.png");
        gallery.show("jpg", "jiraya.jpg");
        gallery.show("gif", "sakura.gif");


        int x=9;
        if(x==9)
        {
             x=8;
            System.out.println(x);
        }

    }
}
