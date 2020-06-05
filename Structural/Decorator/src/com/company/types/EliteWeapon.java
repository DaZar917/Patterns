package com.company.types;

import com.company.DecoratorWeapon;
import com.company.Weapon;

public class EliteWeapon extends DecoratorWeapon {

    public EliteWeapon(Weapon weapon) {
        super(weapon);
    }

    @Override
    public String statics() {
        return weapon.statics()+" damage +30% , accuracy +50%\n";
    }
}
