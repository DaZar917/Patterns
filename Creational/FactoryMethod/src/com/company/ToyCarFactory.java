package com.company;

public class ToyCarFactory implements ToyFactory {
    @Override
    public InjectionMold createNewToy() {
        System.out.println("Car has been created...");
        return new ToyCarMold();
    }
}
