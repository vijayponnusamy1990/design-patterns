package com.example.designpatterns.factory;

public interface Car {

    public String getType();

    default void drive(){
        System.out.println("Trip Started");
        start();
        stop();
        System.out.println("Trip Ended");
    }

    public void start();

    public void stop();
}
