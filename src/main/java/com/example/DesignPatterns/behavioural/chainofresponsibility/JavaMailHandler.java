package com.example.DesignPatterns.behavioural.chainofresponsibility;

public class JavaMailHandler implements EmailHandler{

    Email email=new Email();
    private EmailHandler next;


    JavaMailHandler(String from,String to,String subject,String body){
        email.setFrom(from);
        email.setTo(to);
        email.setSubject(subject);
        email.setBody(body);
    }
    @Override
    public void setNext(EmailHandler handler) {
        next = handler;
    }
    @Override
    public void handleRequest() {


        if(email.getFrom().endsWith("@javamail.com"))
        {
            System.out.println("Inside Java Mail Handler ...........");
         //   next.handleRequest();
        }else{
            //handle request (move to correct folder)
            System.out.println("Inside Java Mail Handler ...........");

        }
    }
}
