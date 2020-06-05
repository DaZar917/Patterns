package com.company;

public class Facade {
    private Computer computer;
    private Projector projector;
    private ProjecorPlatno projecorPlatno;


    public Facade(Computer computer, Projector projector, ProjecorPlatno projecorPlatno) {
        this.computer = computer;
        this.projector = projector;
        this.projecorPlatno = projecorPlatno;
    }

    public void startProj(){
        computer.start();
        projector.start();
        projecorPlatno.start();
    }

    public void finishProj(){
        computer.stop();
        projecorPlatno.stop();
        projector.stop();
    }
}
