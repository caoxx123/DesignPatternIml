package io.caoxx123.o4J2EEModel.o28CompositeEntityPattern.demo;

public class CompositeEntity {
    private CoarseGrainedObject coarseGrainedObject=new CoarseGrainedObject();
    public void setData(String data1,String data2){
        coarseGrainedObject.setData(data1,data2);
    }
    public String[] getData(){
        return coarseGrainedObject.getData();
    }
}
