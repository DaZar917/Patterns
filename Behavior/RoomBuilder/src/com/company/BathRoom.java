package com.company;

public class BathRoom extends RoomBuilder{

    @Override
    void buildWalls() {
        room.setWalls("водовідтолкуючі");
    }

    @Override
    void buildWindows() {
        room.setWindows("Without Windows");
    }

    @Override
    void buildRoof() {
        room.setRoof("водовідтокуючий");
    }
}
