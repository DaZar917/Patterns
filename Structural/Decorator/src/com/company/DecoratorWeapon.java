package com.company;

public class DecoratorWeapon implements Weapon {

    Weapon weapon;

    public DecoratorWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String statics() {
        return "DecoratorWeapon{" +
                "weapon=" + weapon +
                '}';
    }

}
