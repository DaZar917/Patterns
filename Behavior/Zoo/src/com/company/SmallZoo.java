package com.company;

public class SmallZoo extends ZooBuilder{
    @Override
    void buildLion() {
        zoo.setLion("Small lions");
    }

    @Override
    void buildElephant() {
        zoo.setElephant("Small elephants");
    }

    @Override
    void buildMonkey() {
        zoo.setMonkey("Small monkey");
    }
}
