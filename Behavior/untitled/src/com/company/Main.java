package com.company;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer("Sociable");
        Projector projector = new Projector("Volume");
        ProjecorPlatno projecorPlatno = new ProjecorPlatno("ta zdash tu");

        Facade facade = new Facade(computer,projector,projecorPlatno);
        facade.startProj();

        System.out.println("\n=====================\n");

        facade.finishProj();
    }
}
