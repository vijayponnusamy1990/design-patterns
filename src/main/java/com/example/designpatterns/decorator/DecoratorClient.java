package com.example.designpatterns.decorator;

public class DecoratorClient {
    public static  void main(String[] args){
        Pizza pizza = new ThickCrustPizza();
        Pizza cheesePizza = new Cheese(pizza);
        Pizza greekPizza = new Olives(cheesePizza);
        System.out.println(greekPizza.getDescription() +"\n"+greekPizza.cost());
    }
}
