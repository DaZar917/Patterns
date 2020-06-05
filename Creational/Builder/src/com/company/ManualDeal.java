package com.company;

import com.company.DealBuilder;

public class ManualDeal extends DealBuilder {

    @Override
    void buildEat() {
        deal.setEat("Manual eat");
    }

    @Override
    void buildDrink() {
        deal.setDrink("Manual drink");
    }

    @Override
    void buildDesert() {
        deal.setDesert("Manual desert");
    }

    @Override
    void buildToy() {
        deal.setToy("Manual Car");
    }
}
