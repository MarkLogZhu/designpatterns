package com.marklogzhu.designpatterns.create.builder.v1;

public interface Builder {

    /**
     * 初始化机箱
     */
    void initChassis();

    /**
     * 组装 CPU
     */
    void assemblyCpu(String cpu);
    /**
     * 组装内存
     */
    void assemblyRam(String ram);
    /**
     * 组装主板
     */
    void assemblyMotherboard(String motherboard);
    /**
     * 组装 硬盘
     */
    void assemblyHardDisk(String hardDisk);

    /**
     * 返回主机
     * @return
     */
    Computer getComputer();

}
