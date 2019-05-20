package io.caoxx123.o2StructuralModel.o11FacadePattern.service.serviceIml;

import io.caoxx123.o2StructuralModel.o11FacadePattern.service.Shape;


public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println(this.getClass().getName());
    }
}
