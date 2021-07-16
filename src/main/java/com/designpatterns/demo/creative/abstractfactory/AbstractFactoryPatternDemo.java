package com.designpatterns.demo.creative.abstractfactory;

/**
 * @author jorgenPan
 * @description: TODO
 * @date 2021/7/16
 */
public class AbstractFactoryPatternDemo {

    /**
     * 抽象工厂
     * 针对某一情况，只使用一个具体工厂所参数一系列的产品 例如操作系统、同一厂家提供产品
     *
     * 其实本质也是利用一个关键字去使用某个具体类，让其在某个环境下满足用户对该接口的使用
     * springIoc通过beanName之类的获取bean也是一样的
     *
     * 拓展接口的功能比较麻烦，因为一旦有改动，所有具体类都要实现新修改的方法
     */
    public static void main(String[] args) {
        String[] factoryTypes = new String[]{"GaLi","MiDi","GeLanZi","Auxi"};
        for(String factoryType : factoryTypes){
            System.out.println("新厂家");
            AbstractFactory factory = new AbstractFactory(factoryType);
            factory.produceRefrigerator();
            factory.produceWashingMachine();
            factory.produceDishwasher();
        }

    }

}
