package com.example.designpatterns.builder;

public class BuilderClient {
    public static void main(String[] args){

        Customer.CustomerBuilder builder =  new Customer.CustomerBuilder();
        builder.setCity("Chennai").setId(100).setName("Vijay");
        System.out.println(builder.build().toString());
    }
}
