package com.example.designpatterns.factory;

public class SportsCar implements Car{
    @Override
    public String getType() {
        return "Sports";
    }

    @Override
    public void start() {
        System.out.println("Sports Car Engine Started");
    }

    @Override
    public void stop() {
        System.out.println("Sports Car Engine Stopped");
    }
}
