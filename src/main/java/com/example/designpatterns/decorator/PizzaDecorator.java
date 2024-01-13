package com.example.designpatterns.decorator;

public abstract class PizzaDecorator extends  Pizza{

    protected Pizza pizza;

    public abstract String getDescription();
}
