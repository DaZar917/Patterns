package com.company;

public abstract class PizzaBuilder {
    Pizza pizza;

    void create() {
        pizza = new Pizza();
    }

    abstract void buildKolbasa();
    abstract void buildSyr();
    abstract void buildTesto();

    public Pizza getPizza() {
        return pizza;
    }
}
