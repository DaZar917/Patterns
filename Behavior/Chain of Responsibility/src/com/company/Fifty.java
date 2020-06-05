package com.company;

public class Fifty extends Money {

    public Fifty(Value value) {
        super(value);
    }

    @Override
    public void write(String message) {
        System.out.println("Gave with 50 money: " + message);
    }
}
