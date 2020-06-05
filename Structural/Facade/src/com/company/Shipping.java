package com.company;

public class Shipping {
    private boolean activeShipping=false;

    public boolean isActiveShipping() {
        return activeShipping;
    }

    public void startShipping(){
        System.out.println("Shipping starts...");
    }

    public void toggle(){
        activeShipping = !activeShipping;
    }
}
