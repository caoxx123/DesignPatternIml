package io.caoxx123.o5PrototypePattern.demo;

public class Rectangle extends Shape {
    public Rectangle(){
        type="Rectangle";
    }
    @Override
    void draw() {
        System.out.println("Rectangle::draw()");
    }
}
