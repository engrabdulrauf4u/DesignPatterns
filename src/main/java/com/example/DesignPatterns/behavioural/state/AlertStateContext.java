package com.example.DesignPatterns.behavioural.state;

public class AlertStateContext {

    MobileAlertState currentState;

    public AlertStateContext()
    {
        currentState = new VibrationState();
    }

    public void setState(MobileAlertState state)
    {
        currentState = state;
    }
    public void alert() { currentState.alert(this); }
}
