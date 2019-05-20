package io.caoxx123.o11FacadePattern.service.serviceIml;

import io.caoxx123.o11FacadePattern.service.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println(this.getClass().getName());
    }
}
