package io.caoxx123.o10DecoratorPattern.service.serviceIml;

import io.caoxx123.o10DecoratorPattern.service.Shape;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }
    public void draw() {
        decoratedShape.draw();
    }
}
