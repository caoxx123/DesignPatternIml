package io.caoxx123.o3BehavioralModel.o24TemplatePattern.demo;

public class Football extends Game {
    @Override
    public void init() {
        System.out.println("football init");
    }

    @Override
    public void startPlay() {
        System.out.println("football start");
    }

    @Override
    public void endPlay() {
        System.out.println("football end");
    }
}
