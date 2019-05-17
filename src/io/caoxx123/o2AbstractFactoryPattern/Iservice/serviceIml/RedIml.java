package io.caoxx123.o2AbstractFactoryPattern.Iservice.serviceIml;

import io.caoxx123.o2AbstractFactoryPattern.Iservice.IColor;

public class RedIml implements IColor {
    @Override
    public void fill() {
        System.out.println("RedIml::fill()");
    }
}
