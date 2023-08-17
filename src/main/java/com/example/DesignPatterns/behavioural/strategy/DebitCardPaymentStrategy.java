package com.example.DesignPatterns.behavioural.strategy;

public class DebitCardPaymentStrategy implements PaymentStrategy{
    @Override
    public void processpayment(double amount) {
        System.out.println("Processing debit card payment of amount " + amount);

    }
}
