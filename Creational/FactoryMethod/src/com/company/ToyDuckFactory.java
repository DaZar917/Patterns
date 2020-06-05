package com.company;

public class ToyDuckFactory implements ToyFactory {
    @Override
    public InjectionMold createNewToy() {
        System.out.println("Duck has been created");
        return new ToyDuckMold();
    }
}
