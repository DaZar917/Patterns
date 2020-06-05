package com.company;

import com.company.Interface.Door;
import com.company.Interface.Hood;
import com.company.Interface.StampingEquipment;
import com.company.Interface.Wheel;
import com.company.SportCar.SportCarStampingEnquipment;

public class Ferrari {
    public static void main(String[] args) {
        StampingEquipment stampingEquipment = new SportCarStampingEnquipment();
        Wheel wheel = stampingEquipment.getWheel();
        Hood hood = stampingEquipment.getHood();
        Door door = stampingEquipment.getDoor();

        System.out.println("Creating a Ferrari:");
        wheel.stampWheel();
        hood.stampHood();
        door.stampDoor();
    }
}
