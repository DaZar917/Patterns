package com.company;

public class PizzaRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setPizzaBuilder(new Havai());
        Pizza pizza = director.pizza();
        System.out.println(pizza);
    }
}
