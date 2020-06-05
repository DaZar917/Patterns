package com.company;

public class Car implements Strategy {
    @Override
    public void justDoIt() {
        System.out.println("Move by car...");
    }
}
