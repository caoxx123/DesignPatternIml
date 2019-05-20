package io.caoxx123.o3BehavioralModel.o18MediatorPattern.demo;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        User goudan=new User("狗蛋");
        User zhangsan=new User("张三");
        goudan.seneMessage("你好，我是狗蛋");
        zhangsan.seneMessage("你好，我是张三");
    }
}
