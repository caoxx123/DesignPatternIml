package io.caoxx123.o3BehavioralModel.o20ObserverPattern.demo;

public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
    this.subject=subject;
    this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String "+Integer.toHexString(subject.getState()).toUpperCase());
    }
}
