package com.company;

public class HallStampingEquipment implements StampingEquipment{

    @Override
    public Walls getWalls() {
        return new HallWalls();
    }

    @Override
    public Windows getWindows() {
        return new HallWindows();
    }

    @Override
    public Roof getRoof() {
        return new HallRoof();
    }
}
