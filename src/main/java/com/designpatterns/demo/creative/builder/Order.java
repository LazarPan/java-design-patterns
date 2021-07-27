package com.designpatterns.demo.creative.builder;

import lombok.Getter;
import lombok.Setter;

/**
 * @author director
 * @description: TODO
 * @date 2021/7/27
 */

@Setter
@Getter
public class Order {
    private String cpu;

    private String mainBoard;

    private String ram;

    private String gpu;

    private String power;

    private String box;
}
