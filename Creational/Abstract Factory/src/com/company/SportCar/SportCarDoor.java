package com.company.SportCar;

import com.company.Interface.Door;

public class SportCarDoor implements Door {

    @Override
    public void stampDoor() {
        System.out.println("Stamping doors for SportCar");
    }
}
