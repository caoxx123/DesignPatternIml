package io.caoxx123.o14ChainofResponsibilityPattern.demo;

public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int leval) {
        this.leval=leval;
    }

    @Override
    protected void Write(String message) {
        System.out.println("ERROR Consolelogger"+message);
    }
}
