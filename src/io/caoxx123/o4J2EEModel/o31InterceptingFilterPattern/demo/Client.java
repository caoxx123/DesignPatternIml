package io.caoxx123.o4J2EEModel.o31InterceptingFilterPattern.demo;

public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.FilterRequest(request);
    }
}
