package com.designpatterns.demo.creative.abstractfactory;

/**
 * @author jorgenPan
 * @description: TODO
 * @date 2021/7/16
 */
public class GaLiFactory implements IFactory{

    /**
     * 生成冰箱接口
     */
    @Override
    public void produceRefrigerator() {
        System.out.println("GaLi冰箱");
    }

    /**
     * 生产洗衣机接口
     */
    @Override
    public void produceWashingMachine() {
        System.out.println("GaLi洗衣机");
    }

    /**
     * 生产洗碗机接口
     */
    @Override
    public void produceDishwasher() {
        System.out.println("GaLi洗碗机");
    }
}
