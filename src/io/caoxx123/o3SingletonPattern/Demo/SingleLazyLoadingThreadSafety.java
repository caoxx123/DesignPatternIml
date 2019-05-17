package io.caoxx123.o3SingletonPattern.Demo;

public class SingleLazyLoadingThreadSafety {
    public static SingleLazyLoadingThreadSafety Instance=null;

    private SingleLazyLoadingThreadSafety(){};

    public static synchronized SingleLazyLoadingThreadSafety  getInstance(){
        if(null==Instance){
            Instance =new SingleLazyLoadingThreadSafety();
        }
        return Instance;
    }

    public void showMessage(){
        System.out.println("我是懒汉单例模式的线程安全版本");
    }
}
