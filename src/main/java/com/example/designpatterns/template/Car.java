package com.example.designpatterns.template;

public abstract  class Car {

    public void make(){
        System.out.println(getEngine());;
        System.out.println(getType());
    }

    protected abstract String getEngine();

    protected  abstract  String getType();
}
