package io.caoxx123.o2AbstractFactoryPattern.demo;

import io.caoxx123.o1FactoryPattern.service.IShape;
import io.caoxx123.o2AbstractFactoryPattern.Iservice.IColor;
//创建抽象类来获取工厂
public abstract class AbstractFactory {
    public abstract IShape getIShape(String shape);
    public abstract IColor getIColor(String color);
}
