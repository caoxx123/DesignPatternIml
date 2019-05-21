package io.caoxx123.o4J2EEModel.o32serviceLocalerPattern.demo;

import io.caoxx123.o4J2EEModel.o32serviceLocalerPattern.service.Service;

import java.util.ArrayList;
import java.util.List;

public class Cache {
    private List<Service> services;

    public Cache() {
        services=new ArrayList<>();
    }

    public Service getService(String servicename){
        for (Service service:services){
            if (service.getName().equalsIgnoreCase(servicename)){
                System.out.println("return service name is"+servicename);
                return service;
            }
        }
        return null;
    }

    public void addService(Service newService){
        boolean exist=false;
        for (Service service:services){
            if(service.getName().equalsIgnoreCase(newService.getName())){
                System.out.println("this service"+newService.getName()+"alerday exist");
                exist=true;
            }
        }
        if (!exist){
            services.add(newService);
        }
    }
}
