package com.company;

import com.company.Interface.Door;
import com.company.Interface.Hood;
import com.company.Interface.StampingEquipment;
import com.company.Interface.Wheel;
import com.company.SerialCar.SerialCarStampingEquipment;

public class Ford {
    public static void main(String[] args) {
        StampingEquipment stampingEquipment = new SerialCarStampingEquipment();
        Door door = stampingEquipment.getDoor();
        Hood hood = stampingEquipment.getHood();
        Wheel wheel = stampingEquipment.getWheel();

        System.out.println("Creating a Ford:");

        door.stampDoor();
        hood.stampHood();
        wheel.stampWheel();
    }
}
