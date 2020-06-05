package com.company.types;

import com.company.Pizza;

public class Salami implements Pizza {
    @Override
    public void addComponents() {
        System.out.println("Salami for pizza..");
    }
}
