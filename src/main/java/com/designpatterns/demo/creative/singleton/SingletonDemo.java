package com.designpatterns.demo.creative.singleton;


/**
 * @author jorgenPan
 * @description: TODO
 * @date 2021/7/17
 */
public class SingletonDemo {


    /**
     * 单例没什么好介绍的
     * <p>
     * 保证一个类仅有一个实例，并提供一个访问它的全局访问点
     * <p>
     * 构造函数私有，并且这种类一半没有状态，或者状态都是共享基本不会变的。
     * 比如@service，注入的属性都是由SpringIoc维护，注入进来的代理类不会改变，有可能代理类里面的url等配置发生改变。
     * 但是不影响本身，还能正常为所有引用提供服务
     */
    public static void main(String[] args) {
        SingletonObject singletonObject = SingletonObject.getInstance();
        singletonObject.print();
        System.out.println(singletonObject.toString());
    }
}
