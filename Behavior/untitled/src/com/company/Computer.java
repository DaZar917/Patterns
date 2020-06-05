package com.company;

public class Computer {

    private boolean isActiveComputer;

    private String name;

    public boolean isActiveComputer() {
        return isActiveComputer;
    }

    public Computer(String name) {
        this.name = name;
    }

    public void start(){
        System.out.println("Computer is run..."+ name);
    }

    public void stop(){
        System.out.println("Computer is not run..."+ name);
    }

}
