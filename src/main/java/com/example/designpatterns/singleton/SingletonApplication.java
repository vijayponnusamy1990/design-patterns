package com.example.designpatterns.singleton;

/**
 *
 */
public class SingletonApplication {
    private static SingletonApplication instance;
    private SingletonApplication(){

    }
    public static SingletonApplication getInstance(){
        if(instance == null){
            synchronized (SingletonApplication.class){
                if(instance == null){
                    instance = new SingletonApplication();
                }
            }
        }
        return instance;
    }
}
