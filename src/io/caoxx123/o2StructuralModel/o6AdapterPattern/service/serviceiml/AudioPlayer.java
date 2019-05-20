package io.caoxx123.o2StructuralModel.o6AdapterPattern.service.serviceiml;

import io.caoxx123.o2StructuralModel.o6AdapterPattern.service.MediaPlayer;

public class AudioPlayer implements MediaPlayer {
    MediaAdapeter mediaAdapeter;
    @Override
    public void play(String adudioType, String fileName) {
        if(adudioType.equalsIgnoreCase("MP3")){
            System.out.println(fileName+adudioType);
        }else if(adudioType.equalsIgnoreCase("VLC")||adudioType.equalsIgnoreCase("MP4")){
            mediaAdapeter=new MediaAdapeter(adudioType);
            mediaAdapeter.play(adudioType,fileName);
        }else {
            System.out.println("the "+adudioType +"not supported");
        }
    }
}
