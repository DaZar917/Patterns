package com.company.types;

import com.company.DecoratorWeapon;
import com.company.Weapon;

public class SuperWeapon extends DecoratorWeapon {

    public SuperWeapon(Weapon weapon) {
        super(weapon);
    }

    @Override
    public String statics() {
        return weapon.statics()+" damage +100%, accuracy +200%\n";
    }

}
