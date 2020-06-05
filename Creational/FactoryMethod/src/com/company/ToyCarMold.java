package com.company;

public class ToyCarMold implements InjectionMold {
    @Override
    public void inject() {
        System.out.println("Make car...");
    }
}
