package io.caoxx123.o7BridgePattern.demo;

import io.caoxx123.o7BridgePattern.service.DrawAPI;

public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
    this.drawAPI=drawAPI;
    }
    public abstract void draw();
}
