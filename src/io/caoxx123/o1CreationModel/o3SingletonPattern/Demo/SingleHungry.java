package io.caoxx123.o1CreationModel.o3SingletonPattern.Demo;

public class SingleHungry {
    public static  SingleHungry  Instance =new SingleHungry();

    private SingleHungry(){}

    public static SingleHungry getInstance() {
        return Instance;
    }

    public  void  showMessage(){
        System.out.println("我是单例的饿汉模式，我是线程安全的");
    }
}
