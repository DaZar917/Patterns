package com.company;

public class Room {
    private String windows;
    private String walls;
    private String roof;

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    @Override
    public String toString() {
        return "Room{" +
                "windows='" + windows + '\'' +
                ", walls='" + walls + '\'' +
                ", roof='" + roof + '\'' +
                '}';
    }
}
