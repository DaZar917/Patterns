package com.company;

public class FacebookRunner {
    public static void main(String[] args) {
        Facebook.getFacebook().addLog("Yaroslav Melnichin");
        Facebook.getFacebook().addLog("Martin Roshko");

        Facebook.getFacebook().showLog();
    }
}
