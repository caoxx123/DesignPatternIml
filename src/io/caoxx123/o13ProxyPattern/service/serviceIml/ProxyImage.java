package io.caoxx123.o13ProxyPattern.service.serviceIml;

import io.caoxx123.o13ProxyPattern.service.Image;

public class ProxyImage implements Image {
    private  RealImage realImage;
    private  String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void disPlay() {
        if (realImage==null){
            realImage=new RealImage(fileName);
        }
        realImage.disPlay();
    }
}
