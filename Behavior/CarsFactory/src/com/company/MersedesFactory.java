package com.company;

public class MersedesFactory implements CarFactory {
    @Override
    public Car carFactory() {
        System.out.println("Create new mersedes...");
        return new Mersedes();
    }
}
