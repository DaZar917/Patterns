package com.company;

public class GovermentRunner {
    public static void main(String[] args) {
        System.out.println(Government.getGovernment().toString());
        Government.getGovernment().addToInfo("\nfirst log...");
        Government.getGovernment().addToInfo("second log...");
        Government.getGovernment().addToInfo("third log...");

        Government.getGovernment().showGovermentFile();

    }
}
