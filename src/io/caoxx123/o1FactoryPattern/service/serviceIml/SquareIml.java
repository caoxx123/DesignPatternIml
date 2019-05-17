package io.caoxx123.o1FactoryPattern.service.serviceIml;

import io.caoxx123.o1FactoryPattern.service.IShape;

public class SquareIml implements IShape {
    @Override
    public void draw() {
        System.out.println("SquareIml::draw()");
    }
}
