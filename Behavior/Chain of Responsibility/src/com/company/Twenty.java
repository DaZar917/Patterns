package com.company;

public class Twenty extends Money {

    public Twenty(Value value) {
        super(value);
    }

    @Override
    public void write(String message) {
        System.out.println("Gave with 20 money: " + message);
    }
}
