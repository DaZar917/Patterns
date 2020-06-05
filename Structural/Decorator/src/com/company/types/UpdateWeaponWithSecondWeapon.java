package com.company.types;

import com.company.DecoratorWeapon;
import com.company.Weapon;

public class UpdateWeaponWithSecondWeapon extends DecoratorWeapon {
    public UpdateWeaponWithSecondWeapon(Weapon weapon) {
        super(weapon);
    }

    @Override
    public String statics() {
        return weapon.statics()+"damage +^^, accuracy +^^";
    }
}
