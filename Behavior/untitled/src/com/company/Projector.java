package com.company;

public class Projector {
    private boolean isActiveProjector;

    private String name;

    public boolean isActiveProjector() {
        return isActiveProjector;
    }

    public Projector(String name) {
        this.name = name;
    }

    public void start(){
        System.out.println("Projector is run..."+ name);
    }

    public void stop(){
        System.out.println("Projector is not run..."+ name);
    }


}
