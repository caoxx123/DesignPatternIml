package io.caoxx123.o10DecoratorPattern.service.serviceIml;

import io.caoxx123.o10DecoratorPattern.service.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println(this.getClass().getName());
    }
}
