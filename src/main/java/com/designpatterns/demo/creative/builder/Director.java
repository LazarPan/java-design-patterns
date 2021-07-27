package com.designpatterns.demo.creative.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jorgenPan
 * @description: TODO
 * @date 2021/7/27
 */
public class Director {

    private static Director director = new Director();

    private List<IBuilder> builderList;

    private Director() {
        builderList = new ArrayList<>();
        builderList.add(new BuilderA());
        builderList.add(new BuilderB());
    }

    public static Director getDirector() {
        return director;
    }

    public Computer getComputer(Order order) {
        Computer computer = new Computer();

        computer.setCpu(findConcreteBuilder(order.getCpu()).builderCpu());
        computer.setMainBoard(findConcreteBuilder(order.getMainBoard()).builderMainBoard());
        computer.setRam(findConcreteBuilder(order.getRam()).builderRAM());
        computer.setGpu(findConcreteBuilder(order.getGpu()).builderGPU());
        computer.setPower(findConcreteBuilder(order.getPower()).builderPower());
        computer.setBox(findConcreteBuilder(order.getBox()).builderBox());

        return computer;
    }

    private IBuilder findConcreteBuilder(String name) {
        if (name != null) {
            for (IBuilder builder : builderList) {
                if (builder.match(name)) {
                    return builder;
                }
            }
        }
        return builderList.get(0);
    }


}
