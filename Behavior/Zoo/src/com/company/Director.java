package com.company;

public class Director {

    ZooBuilder zooBuilder;

    public void setZooBuilder(ZooBuilder zooBuilder) {
        this.zooBuilder = zooBuilder;
    }

    Zoo buildZoo(){
        zooBuilder.createZoo();
        zooBuilder.buildElephant();
        zooBuilder.buildLion();
        zooBuilder.buildMonkey();

        Zoo zoo = zooBuilder.getZoo();
        return zoo;
    }
}
