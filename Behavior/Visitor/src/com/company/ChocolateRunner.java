package com.company;

public class ChocolateRunner {
    public static void main(String[] args) {

        ChocolateFactory chocolateFactory = createByName("milk");
        chocolateFactory.createChoco();

    }

    static public ChocolateFactory createByName(String name){

        if (name.equalsIgnoreCase("milk")){
            System.out.println("Make by name milk...");
            return new MilkChocolateFactory();
        }
        else
            if (name.equalsIgnoreCase("black")) {
                System.out.println("Make by name black....");
                return new BlackChocolateFactory();
            }
            else {
                throw new RuntimeException(name + " is not a chocolate");
            }
    }
}
