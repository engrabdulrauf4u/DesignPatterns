package com.example.DesignPatterns.behavioural.strategy;

public class PaymentProcessor {
    PaymentStrategy paymentStrategy;

   public PaymentProcessor(PaymentStrategy strategey){
     this.paymentStrategy = strategey;
    }

    void processpayment(double amount){
        paymentStrategy.processpayment(amount);
    }
}
