package io.caoxx123.o3BehavioralModel.o14ChainofResponsibilityPattern.demo;

public class FileLogger extends AbstractLogger {
    public FileLogger(int leval) {
    this.leval=leval;
    }

    @Override
    protected void Write(String message) {
        System.out.println("File Console"+message);
    }
}
