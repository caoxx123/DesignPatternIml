package io.caoxx123.o4J2EEModel.o27BusinessDelegatePattern.demo;

import io.caoxx123.o4J2EEModel.o27BusinessDelegatePattern.service.BusinessService;

public class BusinessDelegate {
    private BusinessLookUp businessLookUp=new BusinessLookUp();
    private BusinessService businessService;
    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public void doTask(){
        businessService=businessLookUp.getBusinessService(type);
        businessService.doProcessing();
    }
}
