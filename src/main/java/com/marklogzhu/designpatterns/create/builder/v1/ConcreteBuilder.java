package com.marklogzhu.designpatterns.create.builder.v1;

public class ConcreteBuilder implements Builder {

    private Computer computer = null;

    @Override
    public void initChassis() {
        computer = new Computer();
    }

    @Override
    public void assemblyCpu(String cpu) {
        computer.setCpu(cpu);
    }

    @Override
    public void assemblyRam(String ram) {
        computer.setRam(ram);
    }

    @Override
    public void assemblyMotherboard(String motherboard) {
        computer.setMotherboard(motherboard);
    }

    @Override
    public void assemblyHardDisk(String hardDisk) {
        computer.setHardDisk(hardDisk);
    }


    @Override
    public Computer getComputer() {
        return computer;
    }
}
