package io.caoxx123.o2StructuralModel.o11FacadePattern.demo;

public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker=new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
