package com.company;

public class Runner {
    public static void main(String[] args) {
        CarFactory carFactory = createByName("mers");
        carFactory.carFactory().makeCar();

    }

    public static CarFactory createByName(String name){
        if (name.equalsIgnoreCase("mers")){
            return new MersedesFactory();
        }
        else throw new RuntimeException(name + " is not a car");

    }

}
