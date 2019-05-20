package io.caoxx123.o14ChainofResponsibilityPattern.demo;

public class ChainPatternDemo {
    public static AbstractLogger getChainofLogger(){
        AbstractLogger consoleLogger =new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger ErrorLogger =new ConsoleLogger(AbstractLogger.ERROR);
        AbstractLogger FileLogger =new ConsoleLogger(AbstractLogger.DEBUG);
        ErrorLogger.setAbstractLogger(FileLogger);
        FileLogger.setAbstractLogger(consoleLogger);
        return ErrorLogger;
    }
    public static void main(String[] args) {
        AbstractLogger abstractLoggerchain=getChainofLogger();

        abstractLoggerchain.logMessage(AbstractLogger.INFO,"this is console");
        abstractLoggerchain.logMessage(AbstractLogger.ERROR,"this is error");
        abstractLoggerchain.logMessage(AbstractLogger.DEBUG,"this is debug");
    }
}
