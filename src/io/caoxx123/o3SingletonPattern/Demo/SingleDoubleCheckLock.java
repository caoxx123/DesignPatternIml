package io.caoxx123.o3SingletonPattern.Demo;

public class SingleDoubleCheckLock {
    public volatile static SingleDoubleCheckLock Instance;

    private SingleDoubleCheckLock() {
    }

    public static SingleDoubleCheckLock getInstance() {
        if (null == Instance) {
            synchronized (SingleDoubleCheckLock.class){
            if (null == Instance) {
                Instance = new SingleDoubleCheckLock();
            }
            }
        }
        return Instance;
    }

    public void showMessage() {
        System.out.println("我是单例模式的双重锁实现，不但安全而且在多线程下性能高");
    }
}
