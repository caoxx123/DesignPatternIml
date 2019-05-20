package io.caoxx123.o1CreationModel.o2AbstractFactoryPattern.Iservice.serviceIml;

import io.caoxx123.o1CreationModel.o2AbstractFactoryPattern.Iservice.IShape;

public class RectangleIml implements IShape {
    @Override
    public void draw() {
        System.out.println("RectangleIml::draw()");
    }
}
