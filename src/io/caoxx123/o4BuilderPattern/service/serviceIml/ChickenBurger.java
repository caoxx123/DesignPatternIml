package io.caoxx123.o4BuilderPattern.service.serviceIml;

public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "chicken burger";
    }

    @Override
    public float price() {
        return 20f;
    }
}
