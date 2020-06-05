package com.company;

public class Director  {
    DealBuilder builder;

    public void setBuilder(DealBuilder builder) {
        this.builder = builder;
    }

    Deal buildDeal(){
        builder.createDeal();
        builder.buildDesert();
        builder.buildDrink();
        builder.buildEat();
        builder.buildToy();
        Deal deal = builder.getDeal();
        return deal;
    }
}
