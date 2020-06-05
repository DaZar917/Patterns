package com.company.SportCar;

import com.company.Interface.Wheel;

public class SportCarWheel implements Wheel {

    @Override
    public void stampWheel() {
        System.out.println("Stamping wheels for SportCar");
    }
}
