package com.example.designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getShape( String color){
        Shape circle = circleMap.get(color);
        if(circle == null){
            circle = new Circle(color);
            circleMap.put(color, circle);
        }
        return circle;
    }
}
