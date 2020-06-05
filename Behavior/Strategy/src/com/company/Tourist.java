package com.company;

public class Tourist  {
    Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute(){
        strategy.justDoIt();
    }
}
