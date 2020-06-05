package com.company;

public class Taxi implements Strategy {
    @Override
    public void justDoIt() {
        System.out.println("Move by taxi...");
    }
}
