package io.caoxx123.o2StructuralModel.o10DecoratorPattern.demo;

import io.caoxx123.o2StructuralModel.o10DecoratorPattern.service.Shape;
import io.caoxx123.o2StructuralModel.o10DecoratorPattern.service.serviceIml.ShapeDecorator;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("set border is red");
    }
}
