package io.caoxx123.o1CreationModel.o4BuilderPattern.service.serviceIml;

import io.caoxx123.o1CreationModel.o4BuilderPattern.service.IPacking;

public class Wrapper implements IPacking {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
