package io.caoxx123.o2StructuralModel.o7BridgePattern.demo;

import io.caoxx123.o2StructuralModel.o7BridgePattern.service.serviceIml.GreenCircle;
import io.caoxx123.o2StructuralModel.o7BridgePattern.service.serviceIml.RedCircle;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle=new Circle(new RedCircle(),100,10,100);
        Shape GreenCircle=new Circle(new GreenCircle(),10,10,100);

        redCircle.draw();
        GreenCircle.draw();
    }
}
