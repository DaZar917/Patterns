package com.company;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<Pizza> pizzas = new ArrayList<>();

    public void addComp(Pizza pizza){
        pizzas.add(pizza);
    }

    public void remove(Pizza pizza){
        pizzas.remove(pizza);
    }

    public void createPizza(){
        for (Pizza pizza: pizzas) {
            pizza.addComponents();
        }
    }
}
