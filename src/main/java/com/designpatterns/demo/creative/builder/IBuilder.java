package com.designpatterns.demo.creative.builder;

public interface IBuilder {

    boolean match(String name);

    String builderCpu();

    String builderMainBoard();

    String builderRAM();

    String builderGPU();

    String builderPower();

    String builderBox();
}
