package com.company;

public class Bus implements Strategy {
    @Override
    public void justDoIt() {
        System.out.println("Move by bus...");
    }
}
