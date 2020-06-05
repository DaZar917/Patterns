package com.company;

public abstract class RoomBuilder {
    Room room;

    public void setRoom() {
        room = new Room();
    }

    abstract void buildWalls();
    abstract void buildWindows();
    abstract void buildRoof();

    public Room getRoom() {
        return room;
    }
}
