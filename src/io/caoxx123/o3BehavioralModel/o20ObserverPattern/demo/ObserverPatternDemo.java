package io.caoxx123.o3BehavioralModel.o20ObserverPattern.demo;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject= new Subject();
        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);

        System.out.println("15");
        subject.setState(15);
        System.out.println("10");
        subject.setState(10);
    }
}
