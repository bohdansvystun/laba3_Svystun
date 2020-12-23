package com.company.weapon;

import com.company.droids.Droid;

public class WeaponPistol extends Weapon {
    public WeaponPistol() {
        super.setTypeOfWeapon("Pistol");
    }







    @Override
    public void useWeapon(Droid attack, Droid defend) {
        super.useWeapon(attack, defend);
        attack.makeHit(defend);
    }
}
