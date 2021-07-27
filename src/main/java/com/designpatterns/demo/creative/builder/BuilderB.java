package com.designpatterns.demo.creative.builder;

/**
 * @author jorgenPan
 * @description: TODO
 * @date 2021/7/27
 */
public class BuilderB implements IBuilder{

    @Override
    public boolean match(String name) {
        return "zhenhuo".equalsIgnoreCase(name.trim());
    }

    @Override
    public String builderCpu() {
        return "正版CPU";
    }

    @Override
    public String builderMainBoard() {
        return "正版主板";
    }

    @Override
    public String builderRAM() {
        return "正版内存";
    }

    @Override
    public String builderGPU() {
        return "正版显卡";
    }

    @Override
    public String builderPower() {
        return "正版电源";
    }

    @Override
    public String builderBox() {
        return "正版机箱";
    }
}
