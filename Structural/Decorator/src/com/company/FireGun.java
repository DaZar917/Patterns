package com.company;

import com.company.types.BaseWeapon;
import com.company.types.EliteWeapon;
import com.company.types.SuperWeapon;
import com.company.types.UpdateWeaponWithSecondWeapon;

public class FireGun {
    public static void main(String[] args) {
        Weapon baseWeapon = new BaseWeapon();
        System.out.println(baseWeapon.statics());

        Weapon eliteWeapon = new EliteWeapon(new BaseWeapon());
        System.out.println(eliteWeapon.statics());

        Weapon superWeapon = new SuperWeapon(new BaseWeapon());
        System.out.println(superWeapon.statics());

        Weapon update = new UpdateWeaponWithSecondWeapon(new EliteWeapon( new BaseWeapon()));
        System.out.println(update.statics());
    }
}
