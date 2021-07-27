package com.designpatterns.demo.creative.builder;

/**
 * @author jorgenPan
 * @description: TODO
 * @date 2021/7/27
 */
public class BuilderA implements IBuilder{
    @Override
    public boolean match(String name) {
        return "shuihuo".equalsIgnoreCase(name.trim());
    }

    @Override
    public String builderCpu() {
        return "伪劣cpu";
    }

    @Override
    public String builderMainBoard() {
        return "跑不起来主板";
    }

    @Override
    public String builderRAM() {
        return "虚标内存";
    }

    @Override
    public String builderGPU() {
        return "200块的3080";
    }

    @Override
    public String builderPower() {
        return "易燃易爆电源";
    }

    @Override
    public String builderBox() {
        return "纸盒";
    }
}
