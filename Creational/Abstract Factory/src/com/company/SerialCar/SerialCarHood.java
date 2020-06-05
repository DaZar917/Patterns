package com.company.SerialCar;

import com.company.Interface.Hood;

public class SerialCarHood implements Hood {
    @Override
    public void stampHood() {
        System.out.println("Stamping a hood for SerialCar");
    }
}
