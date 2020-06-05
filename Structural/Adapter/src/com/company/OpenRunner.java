package com.company;

public class OpenRunner {
    public static void main(String[] args) {
        Ratchet ratchet = new Ratchet();
        ratchet.openWithRatchet();

        Socket socket = new Socket();
        socket.openWithSocket();

        Adapter adapter = new Adapter();
        adapter.openWithRatchetWithSocket();
    }
}
