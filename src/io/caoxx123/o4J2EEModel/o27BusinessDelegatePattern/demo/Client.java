package io.caoxx123.o4J2EEModel.o27BusinessDelegatePattern.demo;

public class Client {
    public BusinessDelegate businessDelegate;

    public Client(BusinessDelegate businessDelegate) {
        this.businessDelegate = businessDelegate;
    }
    public void doTask(){
        businessDelegate.doTask();
    }
}
