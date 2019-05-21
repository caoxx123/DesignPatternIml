package io.caoxx123.o4J2EEModel.o31InterceptingFilterPattern.service.serviceIml;

import io.caoxx123.o4J2EEModel.o31InterceptingFilterPattern.service.Filter;

public class AuthenticationFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Authentication request"+request);
    }
}
