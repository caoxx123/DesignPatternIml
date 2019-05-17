package io.caoxx123.o3SingletonPattern.Demo;

public class SingleObject {
    //创建SingleObject对象
    public static SingleObject instance = new SingleObject();

    //构造方法私有化
    private SingleObject() {
    }

    //获取SingleObject实例
    public static SingleObject getInstance() {
        return instance;
    }

    public void ShouMessage() {
        System.out.println("hello SinglePattern");
    }
}
