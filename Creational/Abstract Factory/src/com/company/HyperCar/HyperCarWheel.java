package com.company.HyperCar;

import com.company.Interface.Wheel;

public class HyperCarWheel implements Wheel {
    @Override
    public void stampWheel() {
        System.out.println("Stamping wheels for HyperCar");
    }
}
