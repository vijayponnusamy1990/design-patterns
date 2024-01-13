package com.example.designpatterns.decorator;

public class Olives extends  PizzaDecorator{
    public Olives(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return pizza.cost();
    }

    @Override
    public String getDescription() {
        return "Olives "+ pizza.getDescription();
    }
}
