package io.caoxx123.o1CreationModel.o2AbstractFactoryPattern.demo;

import io.caoxx123.o1CreationModel.o1FactoryPattern.service.IShape;
import io.caoxx123.o1CreationModel.o2AbstractFactoryPattern.Iservice.IColor;
import io.caoxx123.o1CreationModel.o2AbstractFactoryPattern.Iservice.serviceIml.BlueIml;
import io.caoxx123.o1CreationModel.o2AbstractFactoryPattern.Iservice.serviceIml.GreenIml;
import io.caoxx123.o1CreationModel.o2AbstractFactoryPattern.Iservice.serviceIml.RedIml;

public class ColorFactory extends AbstractFactory {
    @Override
    public IShape getIShape(String shape) {
        return null;
    }

    @Override
    public IColor getIColor(String color) {
        if(null==color){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new RedIml();
        }else if(color.equalsIgnoreCase("BLUE")){
            return new BlueIml();
        }else if(color.equalsIgnoreCase("GREEN")){
            return new GreenIml();
        }
        return null;
    }
}
