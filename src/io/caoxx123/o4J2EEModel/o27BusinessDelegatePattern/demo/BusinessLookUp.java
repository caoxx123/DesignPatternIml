package io.caoxx123.o4J2EEModel.o27BusinessDelegatePattern.demo;

import io.caoxx123.o4J2EEModel.o27BusinessDelegatePattern.service.BusinessService;
import io.caoxx123.o4J2EEModel.o27BusinessDelegatePattern.service.serviceIml.EJBService;
import io.caoxx123.o4J2EEModel.o27BusinessDelegatePattern.service.serviceIml.JMSService;

public class BusinessLookUp {
    public BusinessService getBusinessService(String type){
        if (type.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }
}
