package io.caoxx123.o4J2EEModel.o31InterceptingFilterPattern.demo;

import io.caoxx123.o4J2EEModel.o31InterceptingFilterPattern.service.Filter;

public class FilterManager {
    FilterChain filterChain;

    public FilterManager(Target target) {
        filterChain=new FilterChain();
        filterChain.setTarget(target);
    }

    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void FilterRequest(String request){
        filterChain.execute(request);
    }
}
