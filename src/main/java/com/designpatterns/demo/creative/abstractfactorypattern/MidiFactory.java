package com.designpatterns.demo.creative.abstractfactorypattern;

/**
 * @author jorgenPan
 * @description: TODO
 * @date 2021/7/16
 */
public class MidiFactory implements IFactory {

    /**
     * 生成冰箱接口
     */
    @Override
    public void produceRefrigerator() {
        System.out.println("Midi冰箱");
    }

    /**
     * 生产洗衣机接口
     */
    @Override
    public void produceWashingMachine() {
        System.out.println("Midi洗衣机");
    }

    /**
     * 生产洗碗机接口
     */
    @Override
    public void produceDishwasher() {
        System.out.println("Midi洗碗机");
    }
}
