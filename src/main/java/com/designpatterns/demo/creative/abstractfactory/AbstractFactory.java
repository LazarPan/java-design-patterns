package com.designpatterns.demo.creative.abstractfactory;

/**
 * @author jorgenPan
 * @description: TODO
 * @date 2021/7/16
 */
public class AbstractFactory implements IFactory{

    private IFactory factory;

    public AbstractFactory(String key) {
        switch (key) {
            case "GaLi": {
                this.factory = new GaLiFactory();
                break;
            }
            case "MiDi": {
                this.factory = new MidiFactory();
                break;
            }
            case "GeLanZi": {
                this.factory = new GeLanZiFactory();
                break;
            }
            default: {
                throw new RuntimeException("没有这个厂商！");
            }
        }
    }


    /**
     * 生成冰箱接口
     */
    @Override
    public void produceRefrigerator() {
        factory.produceRefrigerator();
    }

    /**
     * 生产洗衣机接口
     */
    @Override
    public void produceWashingMachine() {
        factory.produceWashingMachine();
    }

    /**
     * 生产洗碗机接口
     */
    @Override
    public void produceDishwasher() {
        factory.produceDishwasher();
    }
}
