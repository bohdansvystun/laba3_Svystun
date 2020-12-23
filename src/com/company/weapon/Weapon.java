package com.company.weapon;

import com.company.droids.Droid;

public class Weapon {
    private String weaponType;

    public Weapon() {
        this.weaponType = "No weapon";
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public void useWeapon(Droid attack, Droid defend){
        System.out.printf("Droid %s use weapon %s in a fight with droid %s\n", attack.getName(), this.weaponType, defend.getName());
    }


}
