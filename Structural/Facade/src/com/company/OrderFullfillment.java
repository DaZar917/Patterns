package com.company;

public class OrderFullfillment {
    private boolean activeOrder = false;

    public boolean isActiveOrder() {
        return activeOrder;
    }

    public void startOrder(){
        System.out.println("Order starts...");
    }

    public void toggle(){
        activeOrder = !activeOrder;
    }
}
