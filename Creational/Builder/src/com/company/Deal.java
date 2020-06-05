package com.company;

public class Deal {
    private String eat;
    private String drink;
    private String desert;
    private String toy;

    public void setDesert(String desert) {
        this.desert = desert;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public void setToy(String toy) {
        this.toy = toy;
    }

    @Override
    public String toString() {
        return "Deal{" +
                "eat='" + eat + '\'' +
                ", drink='" + drink + '\'' +
                ", desert='" + desert + '\'' +
                ", toy='" + toy + '\'' +
                '}';
    }
}
