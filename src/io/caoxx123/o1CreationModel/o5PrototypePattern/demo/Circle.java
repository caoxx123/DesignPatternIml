package io.caoxx123.o1CreationModel.o5PrototypePattern.demo;

public class Circle extends Shape {
    public Circle(){
        type="Circle";
    }
    @Override
    void draw() {
        System.out.println("Circle::draw()");
    }
}
