package com.company;


public interface Observer {
    void handleEvent( int value );
    int getValue();
}
