package io.caoxx123.o4J2EEModel.o32serviceLocalerPattern.demo;

import io.caoxx123.o4J2EEModel.o32serviceLocalerPattern.service.Service;

public class ServiceLocatorPatternDemo {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}
