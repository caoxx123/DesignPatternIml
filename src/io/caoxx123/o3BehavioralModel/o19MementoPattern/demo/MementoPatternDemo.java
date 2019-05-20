package io.caoxx123.o3BehavioralModel.o19MementoPattern.demo;

public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("1");
        originator.setState("2");
        careTaker.add(originator.saveMemento());
        originator.setState("3");
        careTaker.add(originator.saveMemento());
        originator.setState("4");
        System.out.println("current satate");
        System.out.println(originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println(originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println(originator.getState());
    }
}
