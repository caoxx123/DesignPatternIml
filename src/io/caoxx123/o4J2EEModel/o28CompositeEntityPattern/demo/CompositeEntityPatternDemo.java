package io.caoxx123.o4J2EEModel.o28CompositeEntityPattern.demo;

public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client=new Client();
        client.setData("1","2");
        client.printData();
        client.setData("11","22");
        client.printData();
    }
}
