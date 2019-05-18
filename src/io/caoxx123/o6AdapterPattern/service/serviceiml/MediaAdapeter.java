package io.caoxx123.o6AdapterPattern.service.serviceiml;

import io.caoxx123.o6AdapterPattern.service.AdvancedMediaPlayer;
import io.caoxx123.o6AdapterPattern.service.MediaPlayer;

public class MediaAdapeter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;
    public MediaAdapeter (String audioType){
        if (audioType.equalsIgnoreCase("VLC")){
            advancedMediaPlayer=new VlcPlayer();
        }else if (audioType.equalsIgnoreCase("MP4")){
            advancedMediaPlayer=new Mp4Player();
        }
    }
    @Override
    public void play(String adudioType, String fileName) {
        if (adudioType.equalsIgnoreCase("VLC")){
            advancedMediaPlayer.playVlc(fileName);
        }else if(adudioType.equalsIgnoreCase("MP4")){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
