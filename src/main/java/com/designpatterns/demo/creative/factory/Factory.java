package com.designpatterns.demo.creative.factory;

/**
 * @author jorgenPan
 * @description: TODO
 * @date 2021/7/15
 */
public class Factory {

    /**
     * 根据关键字去判断调用哪个具体实现类
     */
    public IProduct getConcrete(String key) {
        switch (key) {
            case "ConcreteOne" -> {
                return new ConcreteOne();
            }
            case "ConcreteTwo" -> {
                return new ConcreteTwo();
            }
            case "ConcreteThree" -> {
                return new ConcreteThree();
            }
            default -> {
                System.out.println(" no suitable concrete factory ...");
                return null;
            }
        }
    }
}
