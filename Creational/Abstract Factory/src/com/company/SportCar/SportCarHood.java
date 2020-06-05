package com.company.SportCar;

import com.company.Interface.Hood;

public class SportCarHood implements Hood {
    @Override
    public void stampHood() {
        System.out.println("Stamping a hood for SportCar");
    }
}
