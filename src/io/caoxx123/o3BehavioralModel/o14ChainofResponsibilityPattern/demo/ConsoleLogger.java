package io.caoxx123.o3BehavioralModel.o14ChainofResponsibilityPattern.demo;

public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int leval) {
        this.leval=leval;
    }

    @Override
    protected void Write(String message) {
        System.out.println("standa console"+message);
    }
}
