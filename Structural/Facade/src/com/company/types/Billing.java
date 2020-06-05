package com.company.types;

public class Billing {
    private boolean activeBilling =false;

    public boolean isActiveBilling(){
        return activeBilling;
    }

    public void startBilling(){
        System.out.println("Starts billing...");
    }

    public void toggle(){
        activeBilling = !activeBilling;
    }

}
