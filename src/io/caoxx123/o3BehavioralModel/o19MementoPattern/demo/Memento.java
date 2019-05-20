package io.caoxx123.o3BehavioralModel.o19MementoPattern.demo;

public class Memento {//遗物，纪念品
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
