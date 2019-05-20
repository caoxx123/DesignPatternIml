package io.caoxx123.o2StructuralModel.o12FlyweightPattern.service.serviceIml;

import io.caoxx123.o2StructuralModel.o12FlyweightPattern.service.Shape;

public class Circle implements Shape {
    private String color;
    private  int x;
    private  int y;
    private  int radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("my color"+this.color);
        System.out.println("my x"+this.x);
        System.out.println("my y"+this.y);
        System.out.println("my radius"+this.radius);
    }
}
