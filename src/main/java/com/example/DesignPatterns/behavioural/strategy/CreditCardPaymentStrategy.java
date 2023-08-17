package com.example.DesignPatterns.behavioural.strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy{
    @Override
    public void processpayment(double amount) {
        System.out.println("Processing credit card payment of amount " + amount);
    }
}
