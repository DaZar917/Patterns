package com.company;

public class ZooRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setZooBuilder(new BigZoo());
        Zoo zoo = director.buildZoo();
        System.out.println(zoo);

    }
}
