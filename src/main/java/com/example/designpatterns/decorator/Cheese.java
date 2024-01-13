package com.example.designpatterns.decorator;

public class Cheese extends  PizzaDecorator{

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return pizza.cost();
    }

    @Override
    public String getDescription() {
        return "Cheese "+pizza.getDescription();
    }
}
