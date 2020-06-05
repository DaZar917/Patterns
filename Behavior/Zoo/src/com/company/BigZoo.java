package com.company;

public class BigZoo extends ZooBuilder {

    @Override
    void buildLion() {
        zoo.setLion("Big lions");
    }

    @Override
    void buildElephant() {
        zoo.setElephant("Big elephants");
    }

    @Override
    void buildMonkey() {
        zoo.setMonkey("Big monkey");
    }
}
