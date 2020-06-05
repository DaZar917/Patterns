package com.company.types;

import com.company.Pizza;

public class Cheese implements Pizza {

    @Override
    public void addComponents() {
        System.out.println("Cheese for pizza..");
    }
}
