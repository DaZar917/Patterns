package com.company;

public class ToyBallMold implements InjectionMold {
    @Override
    public void inject() {
        System.out.println("Make ball...");
    }
}
