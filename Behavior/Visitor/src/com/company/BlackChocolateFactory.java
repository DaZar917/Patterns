package com.company;

public class BlackChocolateFactory implements ChocolateFactory {

    BlackChocolate blackChocolate = new BlackChocolate();

    @Override
    public void createChoco() {
        System.out.println("Start creating black chocolate");
        blackChocolate.makeChocolate();
    }
}
