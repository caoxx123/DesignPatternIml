package io.caoxx123.o2StructuralModel.o7BridgePattern.service.serviceIml;

import io.caoxx123.o2StructuralModel.o7BridgePattern.service.DrawAPI;

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println(this.getClass().getName()+radius);
    }
}
