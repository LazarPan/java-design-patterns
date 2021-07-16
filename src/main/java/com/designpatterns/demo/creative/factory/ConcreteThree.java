package com.designpatterns.demo.creative.factory;

/**
 * @author jorgenPan
 * @description: TODO
 * @date 2021/7/15
 */
public class ConcreteThree implements IProduct{

    @Override
    public void produce() {
        System.out.println("produce concreteThree's product");
    }
}
