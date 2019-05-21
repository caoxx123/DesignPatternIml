package io.caoxx123.o4J2EEModel.o30FrontControllerPattern.demo;

public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController=new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
