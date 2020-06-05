package com.company;

public class Director {
    RoomBuilder roomBuilder;

    public void setRoomBuilder(RoomBuilder roomBuilder) {
        this.roomBuilder = roomBuilder;
    }

    Room createRoom(){
        roomBuilder.setRoom();
        roomBuilder.buildRoof();
        roomBuilder.buildWalls();
        roomBuilder.buildWindows();
        Room room = roomBuilder.getRoom();
        return room;
    }
}
