package com.example.designpatterns.factory;

public class FactoryClient {
    public static void main(String[] args){
        Car car = CarFactory.getInstance("Sports");
        car.drive();
        car = CarFactory.getInstance("Family");
        car.drive();
    }
}
