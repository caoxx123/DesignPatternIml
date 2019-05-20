package io.caoxx123.o1CreationModel.o4BuilderPattern.service.serviceIml;

import io.caoxx123.o1CreationModel.o4BuilderPattern.service.IItem;
import io.caoxx123.o1CreationModel.o4BuilderPattern.service.IPacking;

public abstract class ColdDrink implements IItem {
    @Override
    public IPacking packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
