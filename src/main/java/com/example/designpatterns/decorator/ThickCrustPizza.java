package com.example.designpatterns.decorator;

public class ThickCrustPizza extends  Pizza{

    public ThickCrustPizza() {
        this.description = "ThickCrustPizza";
    }

    @Override
    public double cost() {
        return 5.0;
    }
}
