package com.company;

public class BathroomStampingEquipment implements StampingEquipment {
    @Override
    public Walls getWalls() {
        return new BathroomWalls();
    }

    @Override
    public Windows getWindows() {
        return new BathroomWindows();
    }

    @Override
    public Roof getRoof() {
        return new BathroomRoof();
    }
}
