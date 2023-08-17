package com.example.DesignPatterns.behavioural.strategy;

/**
 * The Strategy Design Pattern is a behavioral design pattern. It allows you to dynamically change the behavior of an object by encapsulating it into different strategies
 * 
 */
public class ClienApplication {

    public static void main(String[] args) {

        PaymentProcessor processor = new PaymentProcessor(new CreditCardPaymentStrategy());

        processor.processpayment(50);

        processor = new PaymentProcessor(new PaypalPaymentStrategy());

        processor.processpayment(70);
    }
}
