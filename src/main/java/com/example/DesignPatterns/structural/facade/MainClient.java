package com.example.DesignPatterns.structural.facade;

public class MainClient {
    public static void main(String[] args) {

        OrderServiceFacade orderFacade = new OrderServiceFacadeImpl();

        boolean result  = orderFacade.placeOrder(23);

        System.out.println("order fulfilled "+result);
    }
}
