package com.designpatterns.demo.creative.abstractfactorypattern;

public interface IFactory {

    /**
     * 生成冰箱接口
     */
    void produceRefrigerator();

    /**
     * 生产洗衣机接口
     */
    void produceWashingMachine();

    /**
     * 生产洗碗机接口
     */
    void produceDishwasher();
}
