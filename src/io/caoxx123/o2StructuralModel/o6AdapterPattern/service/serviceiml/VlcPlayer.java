package io.caoxx123.o2StructuralModel.o6AdapterPattern.service.serviceiml;

import io.caoxx123.o2StructuralModel.o6AdapterPattern.service.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file.name"+fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么都不做
    }
}
