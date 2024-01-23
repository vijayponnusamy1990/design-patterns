package com.example.designpatterns.template;

public class CarMakerClient {

   public static void main(String[] args){
       Car car = new SportsCar();
       car.make();
       car = new FamilyCar();
       car.make();
   }
}
