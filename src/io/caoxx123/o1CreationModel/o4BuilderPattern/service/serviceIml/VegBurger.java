package io.caoxx123.o1CreationModel.o4BuilderPattern.service.serviceIml;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25f;
    }
}
