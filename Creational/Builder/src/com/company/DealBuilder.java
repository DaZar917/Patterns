package com.company;

import com.company.Deal;

public abstract class DealBuilder {
    Deal deal;

    void createDeal(){
        deal = new Deal();
    }

    abstract void buildEat();
    abstract void buildDrink();
    abstract void buildDesert();
    abstract void buildToy();

    public Deal getDeal() {
        return deal;
    }
}
