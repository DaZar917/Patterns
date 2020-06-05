package com.company;

public class RealPayment implements Payment {

    private int amount;
    private String receiver;


    public RealPayment(int amount, String id) {
        this.amount = amount;
        this.receiver = id;
        run();
    }

    @Override
    public void amount() {
        System.out.println( "Amount: " + amount + ", Payment receiver: " + receiver);
    }

    public void run(){
        System.out.println("Running payment for " + receiver + " with amount of " + amount + " ..." );
    }
}
