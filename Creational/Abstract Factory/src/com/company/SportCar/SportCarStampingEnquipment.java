package com.company.SportCar;

import com.company.Interface.Door;
import com.company.Interface.Hood;
import com.company.Interface.StampingEquipment;
import com.company.Interface.Wheel;

public class SportCarStampingEnquipment implements StampingEquipment {

    @Override
    public Wheel getWheel() {
        return new SportCarWheel();
    }

    @Override
    public Hood getHood() {
        return new SportCarHood();
    }

    @Override
    public Door getDoor() {
        return new SportCarDoor();
    }
}
