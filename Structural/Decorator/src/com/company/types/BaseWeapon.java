package com.company.types;

import com.company.Weapon;

public class BaseWeapon implements Weapon {
    private int damage = 50;
    private int accuracy = 30;


    @Override
    public String statics() {
        return "Base weapon: damage = 50, accuracy = 30;\n";
    }

}
