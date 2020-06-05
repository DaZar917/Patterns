package com.company;


public class ProjecorPlatno {

    private String name;
    public boolean isActivePlatno() {
        return isActivePlatno;
    }

    public ProjecorPlatno(String name) {
        this.name = name;
    }

    private boolean isActivePlatno;

    public void start(){
        System.out.println("Platno is run..." + name);
    }

    public void stop(){
        System.out.println("Platno is not run..." + name);
    }


}
