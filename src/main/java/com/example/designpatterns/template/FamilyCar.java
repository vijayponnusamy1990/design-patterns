package com.example.designpatterns.template;

public class FamilyCar extends Car{
    @Override
    protected String getEngine() {
        return "1.5 NA Engine";
    }

    @Override
    protected String getType() {
        return "Family";
    }
}
