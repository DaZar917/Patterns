package com.company.SerialCar;

import com.company.Interface.Door;
import com.company.Interface.Hood;
import com.company.Interface.StampingEquipment;
import com.company.Interface.Wheel;

public class SerialCarStampingEquipment implements StampingEquipment {

    @Override
    public Wheel getWheel() {
        return new SerialCarWheel();
    }

    @Override
    public Hood getHood() {
        return new SerialCarHood();
    }

    @Override
    public Door getDoor() {
        return new SerialCarDoor();
    }
}
