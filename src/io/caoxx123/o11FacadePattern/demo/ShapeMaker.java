package io.caoxx123.o11FacadePattern.demo;


import io.caoxx123.o11FacadePattern.service.Shape;
import io.caoxx123.o11FacadePattern.service.serviceIml.Circle;
import io.caoxx123.o11FacadePattern.service.serviceIml.Rectangle;
import io.caoxx123.o11FacadePattern.service.serviceIml.Square;

public class ShapeMaker {
    private Shape rectangle;
    private Shape circle;
    private Shape square;

    public ShapeMaker() {
        rectangle=new Rectangle();
        circle=new Circle();
        square=new Square();
    }

    public void drawCircle(){
        circle.draw();;
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }
}
