package com.company;

import java.util.List;

public class Bidder implements Observer{
    int value = 0;

    public Bidder(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void handleEvent(int value) {
        System.out.println("The biggest sum is: " + value );
    }
}
