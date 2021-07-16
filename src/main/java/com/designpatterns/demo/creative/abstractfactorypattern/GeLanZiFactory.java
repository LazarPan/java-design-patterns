package com.designpatterns.demo.creative.abstractfactorypattern;

/**
 * @author jorgenPan
 * @description: TODO
 * @date 2021/7/16
 */
public class GeLanZiFactory implements IFactory {

    /**
     * 生成冰箱接口
     */
    @Override
    public void produceRefrigerator() {
        System.out.println("GeLanZi冰箱");
    }

    /**
     * 生产洗衣机接口
     */
    @Override
    public void produceWashingMachine() {
        System.out.println("GeLanZi洗衣机");
    }

    /**
     * 生产洗碗机接口
     */
    @Override
    public void produceDishwasher() {
        System.out.println("GeLanZi洗碗机");
    }
}
