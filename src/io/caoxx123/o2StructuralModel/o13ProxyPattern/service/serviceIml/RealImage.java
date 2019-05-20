package io.caoxx123.o2StructuralModel.o13ProxyPattern.service.serviceIml;

import io.caoxx123.o2StructuralModel.o13ProxyPattern.service.Image;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void disPlay() {
        System.out.println("dispaly"+fileName);
    }

    public void  loadFromDisk(String fileName){
        System.out.println("loading"+fileName);
    }
}
