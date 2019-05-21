package io.caoxx123.o4J2EEModel.o27BusinessDelegatePattern.service.serviceIml;

import io.caoxx123.o4J2EEModel.o27BusinessDelegatePattern.service.BusinessService;

public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("my name is JMSservice");
    }
}
