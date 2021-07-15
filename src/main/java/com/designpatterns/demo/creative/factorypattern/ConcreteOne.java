package com.designpatterns.demo.creative.factorypattern;

/**
 * @author jorgenPan
 * @description: TODO
 * @date 2021/7/15
 */
public class ConcreteOne implements IProduct{

    @Override
    public void produce() {
        System.out.println("produce concreteOne's product");
    }
}
