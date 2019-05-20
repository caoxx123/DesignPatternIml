package io.caoxx123.o1CreationModel.o3SingletonPattern.Demo;

public class SingleLazyLoading {
    public static SingleLazyLoading Instance = null;

    private SingleLazyLoading() {
    }

    public static SingleLazyLoading getInstance() {
        if(null==Instance){
            Instance=new SingleLazyLoading();
        }
        return Instance;
    }

    public void showMessage() {
        System.out.println("我是单例模式的懒汉模式，我不是线程安全的");
    }
}