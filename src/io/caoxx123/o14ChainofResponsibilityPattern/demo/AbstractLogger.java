package io.caoxx123.o14ChainofResponsibilityPattern.demo;

public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int leval;

    protected AbstractLogger next;

    public void setAbstractLogger(AbstractLogger next) {
        this.next = next;
    }

    public void logMessage(int leval, String message) {
        if (this.leval <= leval) {
            Write(message);
        }
        if (next != null) {
            next.logMessage(leval, message);
        }
    }

    abstract protected void Write(String message);
}
