package com.company;

public class AnimalFactory {
    private Animal animal;

    public AnimalFactory(Animal animal) {
        this.animal = animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Animal clone(){
        return (Animal) animal.clone();
    }
}
