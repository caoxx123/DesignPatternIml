package io.caoxx123.o1CreationModel.o4BuilderPattern.service.serviceIml;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "coke";
    }

    @Override
    public float price() {
        return 10f;
    }
}
