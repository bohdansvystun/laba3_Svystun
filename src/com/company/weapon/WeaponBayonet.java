package com.company.weapon;

import com.company.droids.Droid;

public class WeaponBayonet extends Weapon {
    public WeaponBayonet() {
        super.setWeaponType("Bayonet");
    }




    @Override
    public void useWeapon(Droid attack, Droid defend) {
        super.useWeapon(attack, defend);
        attack.makeDamage(defend);
    }
}
