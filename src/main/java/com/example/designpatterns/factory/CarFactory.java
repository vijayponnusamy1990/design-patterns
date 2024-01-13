package com.example.designpatterns.factory;

public class CarFactory {

    public static Car getInstance(String carType){
        switch (carType){
            case "Sports":
                return new SportsCar();
            case "Family":
                return new FamilyCar();
            default:
                throw new IllegalArgumentException("Not supported Car Type : "+ carType);
        }
    }
}
