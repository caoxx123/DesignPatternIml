package io.caoxx123.o1CreationModel.o5PrototypePattern.demo;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape shapeClone1=ShapeCache.getShape("1");
        System.out.println("shape:"+shapeClone1.getType());

        Shape shapeClone2=ShapeCache.getShape("2");
        System.out.println("shape:"+shapeClone2.getType());

        Shape shapeClone3=ShapeCache.getShape("3");
        System.out.println("shape:"+shapeClone3.getType());
    }
}
