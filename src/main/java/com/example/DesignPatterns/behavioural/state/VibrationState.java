package com.example.DesignPatterns.behavioural.state;

public class VibrationState implements MobileAlertState{


    @Override
    public void alert(AlertStateContext ctx) {
        System.out.println(" vibration... & quot");
    }
}
