package com.designpatterns.demo.creative.singleton;

public class SingletonObject {

    private boolean active;

    //预先加载是一开始加载类文件时已经new一个对象
//    private static SingletonObject instance = new SingletonObject(true);

    private static SingletonObject instance;

    private SingletonObject(boolean active) {
        this.active = active;
    }

    /**
     * 懒加载是指get的时候再决定去初始化
     * <p>
     * 最好做下同步操作，因为并发请求该方法时，会触发多次new，导致引用者手上拿到的不一定是最新的
     * 可以优化锁粒度，比如查询是否存在单例前去上锁
     */
//    public static synchronized SingletonObject getInstance() {
    public static SingletonObject getInstance() {
        if (instance == null || !instance.active) {
            synchronized (SingletonObject.class) {
                //上锁后再次查询确认，以免刚刚没拿到锁时查询不是最新值
                if (instance == null || !instance.active) {
                    return new SingletonObject(true);
                } else {
                    return instance;
                }
            }
        }
        return instance;
    }

    public void print() {
        System.out.println("该类正常：" + active);
    }
}
