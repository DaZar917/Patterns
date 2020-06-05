package com.company;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal animal = new Animal("lion", "animal", 123421);
        AnimalFactory animalFactory = new AnimalFactory(animal);
        Animal animal1 = animalFactory.clone();
        Animal animal2 = animalFactory.clone();
        Animal animal3 = animalFactory.clone();


        System.out.println(animal);
        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
    }
}
