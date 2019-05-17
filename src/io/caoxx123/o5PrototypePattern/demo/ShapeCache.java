package io.caoxx123.o5PrototypePattern.demo;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String,Shape> shapeMap=new Hashtable<String,Shape>();
    public  static Shape getShape(String shapeID){
        Shape cacheShape = shapeMap.get(shapeID);
        return (Shape) cacheShape.clone();
    }

    public static void loadCache(){
        Circle circle=new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square=new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle=new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
