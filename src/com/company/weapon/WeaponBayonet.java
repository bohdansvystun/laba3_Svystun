package com.company.weapon;

import com.company.droids.Droid;

public class WeaponBayonet extends Weapon {
    public WeaponBayonet() {
        super.setTypeOfWeapon("Bayonet");
    }




    @Override
    public void useWeapon(Droid attack, Droid defend) {
        super.useWeapon(attack, defend);
        attack.makeHit(defend);
    }
}
