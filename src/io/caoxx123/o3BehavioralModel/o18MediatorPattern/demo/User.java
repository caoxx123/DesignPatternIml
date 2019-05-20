package io.caoxx123.o3BehavioralModel.o18MediatorPattern.demo;

public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }
    public void seneMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
