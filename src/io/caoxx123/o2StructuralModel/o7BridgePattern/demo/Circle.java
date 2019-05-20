package io.caoxx123.o2StructuralModel.o7BridgePattern.demo;

import io.caoxx123.o2StructuralModel.o7BridgePattern.service.DrawAPI;

public class Circle extends Shape {
    private int x, y, radius;

    public Circle(DrawAPI drawAPI, int x, int y, int radius) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
