package com.company;

import com.company.HyperCar.StampingEquipmentHyperCar;
import com.company.Interface.Door;
import com.company.Interface.Hood;
import com.company.Interface.StampingEquipment;
import com.company.Interface.Wheel;

public class Bugatti {
    public static void main(String[] args) {
        StampingEquipment stampingEquipment = new StampingEquipmentHyperCar();
        Door door = stampingEquipment.getDoor();
        Hood hood = stampingEquipment.getHood();
        Wheel wheel = stampingEquipment.getWheel();

        System.out.println("Creating a Bugatti:");

        door.stampDoor();
        hood.stampHood();
        wheel.stampWheel();
    }
}
