package com.company;

public class ProxyPayment implements Payment {
    private int amount;
    private String receiver;
    private RealPayment realPayment;

    public ProxyPayment(int amount, String receiver) {
        this.amount = amount;
        this.receiver = receiver;
    }

    @Override
    public void amount() {
        if (realPayment == null){
            realPayment = new RealPayment(amount,receiver);
        }
        realPayment.amount();
    }
}
