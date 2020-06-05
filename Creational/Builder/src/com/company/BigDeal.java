package com.company;

public class BigDeal extends DealBuilder {

    @Override
    void buildEat() {
        deal.setEat("Big burger");
    }

    @Override
    void buildDrink() {
        deal.setDrink("Big drink");
    }

    @Override
    void buildDesert() {
        deal.setDesert("Big desert");
    }

    @Override
    void buildToy() {
        deal.setToy("Big Car");
    }
}
