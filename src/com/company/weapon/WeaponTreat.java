package com.company.weapon;

import com.company.droids.Droid;

public class WeaponTreat extends Weapon {
    public WeaponTreat() {
        super.setWeaponType("Treat");
    }






    @Override
    public void useWeapon(Droid attack, Droid defend) {
        super.useWeapon(attack, defend);
        attack.setHealth(attack.getHealth() + 25);
    }
}