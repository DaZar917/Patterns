package com.company;

public class Hall extends RoomBuilder {


    @Override
    void buildWalls() {
        room.setWalls("Wide");
    }

    @Override
    void buildWindows() {
        room.setWindows("Big");
    }

    @Override
    void buildRoof() {
        room.setRoof("High");
    }

}
