package com.company.HyperCar;

import com.company.Interface.Door;
import com.company.Interface.Hood;
import com.company.Interface.StampingEquipment;
import com.company.Interface.Wheel;

public class StampingEquipmentHyperCar implements StampingEquipment {

    @Override
    public Wheel getWheel() {
        return new HyperCarWheel();
    }

    @Override
    public Hood getHood() {
        return new HyperCarHood();
    }

    @Override
    public Door getDoor() {
        return new HyperCarDoor();
    }
}
