package io.caoxx123.o1CreationModel.o5PrototypePattern.demo;

public abstract class Shape implements Cloneable {
    public String id;
    public String type;
    abstract void  draw();
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    protected Object clone(){
        Object clone=null;
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return  clone;
    }
}
