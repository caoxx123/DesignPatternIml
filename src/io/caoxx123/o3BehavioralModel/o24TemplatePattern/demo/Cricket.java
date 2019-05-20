package io.caoxx123.o3BehavioralModel.o24TemplatePattern.demo;

public class Cricket extends Game {
    @Override
    public void init() {
        System.out.println("Cricket init");
    }

    @Override
    public void startPlay() {
        System.out.println("Cricket start");
    }

    @Override
    public void endPlay() {
        System.out.println("Cricket end");
    }
}
