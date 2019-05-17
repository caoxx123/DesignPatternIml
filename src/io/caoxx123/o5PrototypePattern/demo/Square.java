package io.caoxx123.o5PrototypePattern.demo;

public class Square extends Shape {
    public Square(){
        type="Square";
    }
    @Override
    void draw() {
        System.out.println("Square::draw()");
    }
}
