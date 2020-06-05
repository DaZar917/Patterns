package com.company;

public class HallRunner {
    public static void main(String[] args) {
        HallStampingEquipment hallStampingEquipment = new HallStampingEquipment();
        Roof roof = hallStampingEquipment.getRoof();
        Windows windows = hallStampingEquipment.getWindows();
        Walls walls = hallStampingEquipment.getWalls();

        System.out.println("Creating a Hall: ");

        roof.stampRoof();
        walls.stampWalls();
        windows.stampWindows();

    }
}
