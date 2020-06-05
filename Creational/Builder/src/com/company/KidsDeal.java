package com.company;

import com.company.DealBuilder;

public class KidsDeal extends DealBuilder {


    @Override
    void buildEat() {
        deal.setEat("mini burger");
    }

    @Override
    void buildDrink() {
        deal.setDrink("mini drink");
    }

    @Override
    void buildDesert() {
        deal.setDesert("mini desert");
    }

    @Override
    void buildToy() {
        deal.setToy("A toy");
    }
}
