package com.example.DesignPatterns.behavioural.strategy;

public class PaypalPaymentStrategy implements PaymentStrategy{
    @Override
    public void processpayment(double amount) {
        System.out.println("Processing PayPal payment of amount " + amount);
    }
}
