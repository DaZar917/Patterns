package com.company;

public class ToyBallFactory implements ToyFactory {
    @Override
    public InjectionMold createNewToy() {
        System.out.println("Ball has been created...");
        return new ToyBallMold();
    }
}
