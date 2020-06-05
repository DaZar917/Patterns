package com.company;

public class MilkChocolateFactory implements ChocolateFactory {
    MilkChocolate milkChocolate = new MilkChocolate();

    @Override
    public void createChoco() {
        System.out.println("Start creating milk chocolate");
        milkChocolate.makeChocolate();
    }
}
