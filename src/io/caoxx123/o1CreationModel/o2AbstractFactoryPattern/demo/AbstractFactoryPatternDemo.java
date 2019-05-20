package io.caoxx123.o1CreationModel.o2AbstractFactoryPattern.demo;

import io.caoxx123.o1CreationModel.o1FactoryPattern.service.IShape;
import io.caoxx123.o1CreationModel.o2AbstractFactoryPattern.Iservice.IColor;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory abstractFactory=FactoryProducer.getAbstractFactory("SHAPE");

        IShape shape1=abstractFactory.getIShape("Rectangle");
        shape1.draw();;
        AbstractFactory colorFactory=FactoryProducer.getAbstractFactory("COLOR");
        IColor color1=colorFactory.getIColor("RED");
        color1.fill();
    }
}
