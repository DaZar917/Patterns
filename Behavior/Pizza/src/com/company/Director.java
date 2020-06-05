package com.company;

public class Director {
    PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    Pizza pizza(){
        pizzaBuilder.create();
        pizzaBuilder.buildKolbasa();
        pizzaBuilder.buildSyr();
        pizzaBuilder.buildTesto();
        Pizza pizza = pizzaBuilder.getPizza();
        return pizza;
    }
}
