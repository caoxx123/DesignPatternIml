package io.caoxx123.o1CreationModel.o2AbstractFactoryPattern.demo;

import io.caoxx123.o1CreationModel.o1FactoryPattern.service.IShape;
import io.caoxx123.o1CreationModel.o1FactoryPattern.service.serviceIml.CircleIml;
import io.caoxx123.o1CreationModel.o1FactoryPattern.service.serviceIml.RectangleIml;
import io.caoxx123.o1CreationModel.o1FactoryPattern.service.serviceIml.SquareIml;
import io.caoxx123.o1CreationModel.o2AbstractFactoryPattern.Iservice.IColor;
//创建工厂类继承抽象类，基于给定信息生成对应的工厂类
public class ShapneFactory extends AbstractFactory {
    @Override
    public IShape getIShape(String shape) {
        if(null==shape){
            return null;
        }
        if(shape.equalsIgnoreCase("SQUARE")){
            return new SquareIml();
        }else if(shape.equalsIgnoreCase("CIRCLE")){
            return new CircleIml();
        }else if(shape.equalsIgnoreCase("RECTANGLE")){
            return new RectangleIml();
        }
        return null;
    }

    @Override
    public IColor getIColor(String color) {
        return null;
    }
}
