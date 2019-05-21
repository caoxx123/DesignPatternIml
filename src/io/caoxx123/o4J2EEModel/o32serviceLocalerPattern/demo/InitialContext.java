package io.caoxx123.o4J2EEModel.o32serviceLocalerPattern.demo;

import io.caoxx123.o4J2EEModel.o32serviceLocalerPattern.service.serviceIml.Service1;
import io.caoxx123.o4J2EEModel.o32serviceLocalerPattern.service.serviceIml.Service2;

public class InitialContext {
    public Object lookup(String JNDIname){
        if (JNDIname.equalsIgnoreCase("SERVICE1")){
            System.out.println("look up and create a new service1");
            return new Service1();
        }else  if (JNDIname.equalsIgnoreCase("SERVICE2")){
            System.out.println("look up and create a new service2");
            return new Service2();
        }
        return null;
    }
}
