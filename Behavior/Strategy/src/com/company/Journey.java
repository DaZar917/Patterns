package com.company;

public class Journey {
    public static void main(String[] args) {
        Tourist tourist= new Tourist();

        tourist.setStrategy(new Car());
        tourist.execute();

        tourist.setStrategy(new Bus());
        tourist.execute();

        tourist.setStrategy(new Taxi());
        tourist.execute();

        System.out.println("Finish.");
    }
}
