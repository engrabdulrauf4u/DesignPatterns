package com.example.DesignPatterns.behavioural.state;

public class SilentState implements MobileAlertState {

    @Override
    public void alert(AlertStateContext ctx) {
        System.out.println(" silent... & quot");
    }
}
