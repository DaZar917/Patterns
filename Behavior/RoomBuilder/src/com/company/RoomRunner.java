package com.company;

public class RoomRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setRoomBuilder(new BathRoom());

        Room room = director.createRoom();
        System.out.println(room);
    }
}
