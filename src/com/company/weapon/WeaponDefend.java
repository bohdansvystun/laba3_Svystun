package com.company.weapon;

import com.company.droids.Droid;

public class WeaponDefend extends Weapon {
    public WeaponDefend() {
        super.setTypeOfWeapon("Defend");
    }






    @Override
    public void useWeapon(Droid attack, Droid defend) {
        super.useWeapon(attack, defend);
        attack.setProtection(attack.getProtection() + 40);
    }
}