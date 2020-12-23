package com.company.weapon;

import com.company.droids.Droid;

public class WeaponDefend extends Weapon {
    public WeaponDefend() {
        super.setWeaponType("Defend");
    }






    @Override
    public void useWeapon(Droid attack, Droid defend) {
        super.useWeapon(attack, defend);
        attack.setAdditionalProtect(attack.getAdditionalProtect() + 40);
    }
}