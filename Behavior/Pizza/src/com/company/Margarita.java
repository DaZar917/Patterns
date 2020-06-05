package com.company;

public class Margarita extends PizzaBuilder {



    @Override
    void buildKolbasa() {
        pizza.setKolbasa("salami");
    }

    @Override
    void buildSyr() {
        pizza.setSyr("parmezan");
    }

    @Override
    void buildTesto() {
        pizza.setTesto("deseve");
    }
}
