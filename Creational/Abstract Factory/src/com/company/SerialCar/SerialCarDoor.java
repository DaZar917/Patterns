package com.company.SerialCar;

import com.company.Interface.Door;

public class SerialCarDoor implements Door {
    @Override
    public void stampDoor() {
        System.out.println("Stamping doors for SerialCar");
    }
}
