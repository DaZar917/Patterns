package com.company;

public class ToyDuckMold implements InjectionMold {
    @Override
    public void inject() {
        System.out.println("Make duck...");
    }
}
