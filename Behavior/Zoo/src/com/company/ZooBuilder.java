package com.company;

public abstract class ZooBuilder {
    Zoo zoo;

    public void createZoo() {
        zoo = new Zoo();
    }

    abstract void buildLion();
    abstract void buildElephant();
    abstract void buildMonkey();

    public Zoo getZoo() {
        return zoo;
    }
}
