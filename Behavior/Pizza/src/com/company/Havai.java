package com.company;

public class Havai extends PizzaBuilder {


    @Override
    void buildKolbasa() {
        pizza.setKolbasa("Synka");
    }

    @Override
    void buildSyr() {
        pizza.setSyr("prosty syr");
    }

    @Override
    void buildTesto() {
        pizza.setTesto("dorohe");
    }

}
