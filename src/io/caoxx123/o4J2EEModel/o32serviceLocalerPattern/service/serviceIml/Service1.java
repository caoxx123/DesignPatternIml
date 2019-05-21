package io.caoxx123.o4J2EEModel.o32serviceLocalerPattern.service.serviceIml;

import io.caoxx123.o4J2EEModel.o32serviceLocalerPattern.service.Service;

public class Service1 implements Service {
    @Override
    public String getName() {
        return this.getClass().getName();
    }

    @Override
    public void execute() {
        System.out.println("use service1");
    }
}
