package com.designpatterns.demo.creative.factorypattern;

import org.springframework.util.Assert;

/**
 * @author jorgenPan
 * @description: TODO
 * @date 2021/7/15
 */
public class FactoryPatternDemo {

    /**
     * 其实该模式只要是根据不同的关键字去选择具体类
     * 让具体类实现同个接口，返回接口类
     * 让实际行为延迟到子类去执行
     */
    public static void main(String[] args) {
        Factory factory = new Factory();
        IProduct product = factory.getConcrete("ConcreteOne");
        product.produce();
        product = factory.getConcrete("ConcreteTwo");
        product.produce();
        product = factory.getConcrete("ConcreteThree");
        product.produce();
        product = factory.getConcrete("ConcreteFour");
        Assert.isNull(product, "product is not null");
    }
}
