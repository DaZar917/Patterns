package com.company;

public class Adapter extends TypeC implements UsbCable{
    @Override
    public void greenCable() {
        greenCableTypeC();
    }

    @Override
    public void redCable() {
        redCableTypeC();
    }

    @Override
    public void blackCable() {
        blackCableTypeC();
    }

    @Override
    public void blueCable() {
        blueCableTypeC();
    }
}
