package io.caoxx123.o1CreationModel.o1FactoryPattern.demo;

import io.caoxx123.o1CreationModel.o1FactoryPattern.service.IShape;
import io.caoxx123.o1CreationModel.o1FactoryPattern.service.serviceIml.CircleIml;
import io.caoxx123.o1CreationModel.o1FactoryPattern.service.serviceIml.RectangleIml;
import io.caoxx123.o1CreationModel.o1FactoryPattern.service.serviceIml.SquareIml;

public class ShapeFactory {
    public IShape getIShape(String shapeType){
        if(null==shapeType){
            return null;
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RectangleIml();
        }else if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new CircleIml();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new SquareIml();
        }else {
            return null;
        }
    }
}
