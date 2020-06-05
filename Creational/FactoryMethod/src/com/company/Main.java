package com.company;

public class Main{
    public static void main (String[] args){
        ToyFactory toyFactory = createToyByName("ball");
        InjectionMold injectionMold = toyFactory.createNewToy();

        injectionMold.inject();
    }

    public static ToyFactory createToyByName(String name){
        if (name.equalsIgnoreCase("Car")){
            return new ToyCarFactory();
        }else
            if (name.equalsIgnoreCase("Duck")){
                return new ToyDuckFactory();
            }
            else
                if (name.equalsIgnoreCase("Ball")){
                    return new ToyBallFactory();
                }
                else
                    throw new RuntimeException(name + " is not a toy");
    }
}