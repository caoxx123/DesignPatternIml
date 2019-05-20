package io.caoxx123.o1CreationModel.o2AbstractFactoryPattern.demo;

public class FactoryProducer {
    public static AbstractFactory getAbstractFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
        return new ShapneFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
        return  new ColorFactory();
        }
        return null;
    }
}
