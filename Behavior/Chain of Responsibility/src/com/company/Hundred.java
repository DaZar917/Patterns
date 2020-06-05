package com.company;

public class Hundred extends Money{


    public Hundred(Value value) {
        super(value);
    }

    @Override
    public void write(String message) {
        System.out.println("Gave with 100 money: " + message);
    }


}
