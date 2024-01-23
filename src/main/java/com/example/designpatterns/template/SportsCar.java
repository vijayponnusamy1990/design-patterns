package com.example.designpatterns.template;

public class SportsCar extends Car{
    @Override
    protected String getEngine() {
        return "V6 Turbo Engine";
    }

    @Override
    protected String getType() {
        return "Sports";
    }
}
