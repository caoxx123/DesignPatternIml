package io.caoxx123.o3BehavioralModel.o19MementoPattern.demo;

public class Originator {//发起人，创作者
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveMemento(){
        return  new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
        state=memento.getState();
    }
}
