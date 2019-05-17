package io.caoxx123.o3SingletonPattern.Demo;

public class SingletonPatternDemo {
    public static void main(String[] args) {
//构造方法司私有化以后提操作不合法
//        SingleObject singleObject1=new SingleObject();
// 获取唯一的引用对象
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.ShouMessage();
        ;
    }
}
