package com.example.DesignPatterns.structural.proxy;

/*
* Lets you provide substitute or placeholder for another object.
* A proxy controls access to the original object.allowing you to perform something either before
*  or after the request gets through to the original object.
* */
public class Consumer {
    public static void main(String[] args) {

        Subject subject =new ProxyClass();

        subject.method();

    }
}
