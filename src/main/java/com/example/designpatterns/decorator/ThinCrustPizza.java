package com.example.designpatterns.decorator;

public class ThinCrustPizza extends  Pizza{

    public ThinCrustPizza() {
        this.description = "ThinCrustPizza";
    }

    @Override
    public double cost() {
        return 8.0;
    }
}
