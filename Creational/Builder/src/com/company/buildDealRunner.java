package com.company;

public class buildDealRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new ManualDeal() );
        Deal deal = director.buildDeal();
        System.out.println(deal);
    }
}
