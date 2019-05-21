package io.caoxx123.o4J2EEModel.o31InterceptingFilterPattern.demo;

import io.caoxx123.o4J2EEModel.o31InterceptingFilterPattern.service.serviceIml.AuthenticationFilter;
import io.caoxx123.o4J2EEModel.o31InterceptingFilterPattern.service.serviceIml.DebugFilter;

public class InterceptingFilterDemo {
    public static void main(String[] args) {

        FilterManager filterManager=new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());
        Client client=new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}
