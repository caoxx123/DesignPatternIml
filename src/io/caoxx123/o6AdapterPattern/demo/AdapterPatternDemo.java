package io.caoxx123.o6AdapterPattern.demo;

import io.caoxx123.o6AdapterPattern.service.serviceiml.AudioPlayer;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer=new AudioPlayer();
        audioPlayer.play("VLC","我爱你中国");
        audioPlayer.play("MP3","我爱你中国1");
        audioPlayer.play("MP4","我爱你中国2");
        audioPlayer.play("MCN","我爱你中国4");
    }
}
