package io.caoxx123.o4J2EEModel.o32serviceLocalerPattern.service.serviceIml;

import io.caoxx123.o4J2EEModel.o32serviceLocalerPattern.service.Service;

public class Service2 implements Service {
    @Override
    public String getName() {
        return getClass().getName();
    }

    @Override
    public void execute() {
        System.out.println("use service2");
    }
}
