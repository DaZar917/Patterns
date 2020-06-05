package com.company;

public enum  Value {
    HUNDRED(100), FIFTY(50),  TWENTY(20);

    private int value;

    Value(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
