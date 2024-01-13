package com.example.designpatterns.factory;

public class FamilyCar implements Car{
    @Override
    public String getType() {
        return "Family";
    }

    @Override
    public void start() {
        System.out.println("Family Car Engine Started");
    }

    @Override
    public void stop() {
        System.out.println("Family Car Engine Stopped");
    }
}
