package io.caoxx123.o1FactoryPattern.demo;

import io.caoxx123.o1FactoryPattern.service.IShape;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();

        IShape shape1=shapeFactory.getIShape("RECTANGLE");
        shape1.draw();

        IShape shape2=shapeFactory.getIShape("CIRCLE");
        shape2.draw();

        IShape shape3=shapeFactory.getIShape("SQUARE");
        shape3.draw();
    }
}
/*RectangleIml::draw()
CircleIml::draw()
SquareIml::draw()*/
