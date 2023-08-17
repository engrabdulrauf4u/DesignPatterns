package com.example.DesignPatterns.behavioural.observer;

import java.util.Arrays;

public class SendEmailMain {
    public static void main(String[] args) {

        Newsletter newsLetter = new Newsletter("Java Challengers");

        Observer duke = new Subscriber("Duke");
        Observer juggy = new Subscriber("Juggy");
        Observer dock = new Subscriber("Moby Dock");

        newsLetter.addsubscriber(duke);
        newsLetter.addNewEmail("Lambda Java Challenge");
        newsLetter.removesubscriber(duke);

        newsLetter.addsubscriber(juggy);
        newsLetter.addsubscriber(dock);
        newsLetter.addNewEmail("Virtual Threads Java Challenge");



    }



}
