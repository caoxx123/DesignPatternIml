package io.caoxx123.o1CreationModel.o2AbstractFactoryPattern.Iservice.serviceIml;

import io.caoxx123.o1CreationModel.o1FactoryPattern.service.IShape;

public class CircleIml implements IShape {
    @Override
    public void draw() {
        System.out.println("CircleIml::draw()");
    }
}
