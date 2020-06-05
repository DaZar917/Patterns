package com.company.SerialCar;

import com.company.Interface.Wheel;

public class SerialCarWheel implements Wheel {
    @Override
    public void stampWheel() {
        System.out.println("Stamping wheels for a SerialCar");
    }
}
