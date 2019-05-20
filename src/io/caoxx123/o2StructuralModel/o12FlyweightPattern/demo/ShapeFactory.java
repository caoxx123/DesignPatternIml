package io.caoxx123.o2StructuralModel.o12FlyweightPattern.demo;

import io.caoxx123.o2StructuralModel.o12FlyweightPattern.service.Shape;
import io.caoxx123.o2StructuralModel.o12FlyweightPattern.service.serviceIml.Circle;

import java.util.HashMap;

public class ShapeFactory {
    public static final HashMap<String, Shape> circleMap=new HashMap<>();
    public  static Shape getCircle(String color){
        Circle circle= (Circle) circleMap.get(color);
        if(null==circle){
            circle=new Circle(color);
            circleMap.put(color,circle);
            System.out.println("cteationg cricle of color:"+color);
        }
        return  circle;
    }
}
