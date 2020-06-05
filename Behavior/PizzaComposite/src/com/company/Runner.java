package com.company;

import com.company.types.Cheese;
import com.company.types.Salami;

public class Runner {
    public static void main(String[] args) {
        Pizza pizza = new Cheese();
        Pizza pizza1 = new Salami();

        Order order = new Order();
        order.addComp(pizza);
        order.addComp(pizza1);
        order.createPizza();
        order.remove(pizza1);
        order.createPizza();
    }
}
