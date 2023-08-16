package com.example.DesignPatterns.behavioural.chainofresponsibility;

public class EmailClient {


    public static void main(String[] args)
    {
        EmailHandler  chainHandler;

        GMailHandler gmailHandler = new GMailHandler("abc@gmail.com","xyz@gmail.com","subject","body");

        BusinessMailHandler bussinessEmaillHandler = new BusinessMailHandler("abc@businessaddress.com","xyz@businessaddress.com","subject","body");
        gmailHandler.setNext(bussinessEmaillHandler);

        JavaMailHandler javamailHandler = new JavaMailHandler("abc@javamail.com","xyz@javamail.com","subject","body");
        bussinessEmaillHandler.setNext(javamailHandler);

        chainHandler = gmailHandler;
        chainHandler.handleRequest();


    }
}
