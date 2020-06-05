package com.company;

public class Bathroom {
    public static void main(String[] args) {
        BathroomStampingEquipment bathroomStampingEquipment = new BathroomStampingEquipment();
        Windows windows = bathroomStampingEquipment.getWindows();
        Walls walls = bathroomStampingEquipment.getWalls();
        Roof roof = bathroomStampingEquipment.getRoof();

        System.out.println("Creating a Bathroom: ");

        walls.stampWalls();
        windows.stampWindows();
        roof.stampRoof();
    }
}
