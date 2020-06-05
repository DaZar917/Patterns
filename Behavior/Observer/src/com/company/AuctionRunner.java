package com.company;

public class AuctionRunner {
    public static void main(String[] args) {
        Observed auction = new Auction();
        Observer bidder = new Bidder(10);
        Observer bidder1 = new Bidder(20);
        Observer bidder2 = new Bidder(30);

        System.out.println("\n========================\n");
        auction.addObserver(bidder);
        auction.addObserver(bidder1);
        System.out.println("\n========================\n");
        auction.addObserver(bidder2);
        System.out.println("\n========================\n");
        auction.removeObserver(bidder2);
    }
}
