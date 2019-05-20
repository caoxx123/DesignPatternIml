package io.caoxx123.o3BehavioralModel.o24TemplatePattern.demo;

public abstract class Game {
    public abstract void init();
    public abstract void startPlay();
    public abstract void endPlay();
    public final void play(){
        init();
        startPlay();;
        endPlay();
    }
}
