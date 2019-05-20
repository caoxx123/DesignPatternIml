package io.caoxx123.o1CreationModel.o2AbstractFactoryPattern.Iservice.serviceIml;

import io.caoxx123.o1CreationModel.o2AbstractFactoryPattern.Iservice.IColor;

public class BlueIml implements IColor {
    @Override
    public void fill() {
        System.out.println("BlueIml::fill()");
    }
}
