package io.caoxx123.o10DecoratorPattern.demo;

import io.caoxx123.o10DecoratorPattern.service.Shape;
import io.caoxx123.o10DecoratorPattern.service.serviceIml.Circle;
import io.caoxx123.o10DecoratorPattern.service.serviceIml.Rectangle;
import io.caoxx123.o10DecoratorPattern.service.serviceIml.ShapeDecorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle");
        circle.draw();
        System.out.println("redCircle");
        redCircle.draw();
        System.out.println("redRectangle");
        redRectangle.draw();
    }
}
