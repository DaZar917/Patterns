package com.company;

public class PaymentRunner {
    public static void main(String[] args) {
        Payment payment = new ProxyPayment(500,"Melnychyn Yaroslav");
        payment.amount();
    }
}
