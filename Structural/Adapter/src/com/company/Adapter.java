package com.company;

public class Adapter extends Socket {

    public void openWithRatchetWithSocket() {
        System.out.print("(Adapter) ");
        openWithSocket();
    }
}
