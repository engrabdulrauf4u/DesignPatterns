package com.example.DesignPatterns.behavioural.chainofresponsibility;

public class BusinessMailHandler  implements EmailHandler{

    Email email=new Email();

    private EmailHandler next;



    public BusinessMailHandler(String from, String to, String subject, String body) {
        email.setFrom(from);
        email.setTo(to);
        email.setSubject(subject);
        email.setBody(body);
    }


    public void setNext(EmailHandler handler){
        next = handler;
    }
    public void handleRequest()
    {

        if(email.getFrom().endsWith("@businessaddress.com"))
        {
            System.out.println("Inside Bussiness Mail Handler ...........");
            next.handleRequest();
        }else
        {
            //handle request (move to correct folder)
            System.out.println("Inside Bussiness Mail Handler ...........");
            next.handleRequest();
        }
}

}
