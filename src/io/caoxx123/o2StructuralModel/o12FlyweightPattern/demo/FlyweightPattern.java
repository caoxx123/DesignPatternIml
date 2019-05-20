package io.caoxx123.o2StructuralModel.o12FlyweightPattern.demo;

import io.caoxx123.o2StructuralModel.o12FlyweightPattern.service.serviceIml.Circle;

public class FlyweightPattern {
    private static final String colors[]={"red","gteen","blue","white","black"};
    public static void main(String[] args) {
    for (int i=0;i<10;i++){
        Circle circle= (Circle) ShapeFactory.getCircle(getRandomColor());
        circle.setX(getRandomX());
        circle.setY(getRandomY());
        circle.setRadius(10);
        circle.draw();
    }
    }
    private static String getRandomColor(){
        return colors[(int) (Math.random()*colors.length)];
    }
    private static int getRandomX(){
        return (int) (Math.random()*100);
    }

    private static int getRandomY(){
        return (int) (Math.random()*100);
    }
}
