package com.company.HyperCar;

import com.company.Interface.Door;

public class HyperCarDoor implements Door {
    @Override
    public void stampDoor() {
        System.out.println("Stamping door for HyperCar");
    }
}
