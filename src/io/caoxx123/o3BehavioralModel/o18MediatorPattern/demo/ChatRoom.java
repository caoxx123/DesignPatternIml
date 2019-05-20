package io.caoxx123.o3BehavioralModel.o18MediatorPattern.demo;

import java.util.Date;

public class ChatRoom {
    public static void showMessage(User user,String message){
        System.out.println(new Date().toString()+user.getName()+message);
    }
}
