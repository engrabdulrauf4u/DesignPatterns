package com.example.DesignPatterns.behavioural.state;

public class StatePattern {
    public static void main(String[] args) {
        AlertStateContext stateContext
                = new AlertStateContext();
        stateContext.alert();
        stateContext.alert();
        stateContext.setState(new SilentState());
        stateContext.alert();
        stateContext.alert();
        stateContext.alert();
    }
}
