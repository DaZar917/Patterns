package com.company;

public abstract class Money {
    private Value value;
    private Money nextMoney;

    public Money(Value value) {
        this.value = value;
    }

    public void setNextMoney(Money nextMoney) {
        this.nextMoney = nextMoney;
    }

    public void giveMoney(String message , int level){
        int temp = value.getValue();
        if(level >= temp){
            write(message);
        }
        if (nextMoney!= null){
            nextMoney.giveMoney(message,level);
        }
    }

    public abstract void write(String message);
}
