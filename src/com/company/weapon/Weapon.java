package com.company.weapon;

import com.company.droids.Droid;

public class Weapon {
    private String typeOfWeapon;

    public Weapon() {
        this.typeOfWeapon = "No weapon";
    }

    public String getTypeOfWeapon() {
        return typeOfWeapon;
    }

    public void setTypeOfWeapon(String typeOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
    }

    public void useWeapon(Droid attack, Droid defend){
        System.out.printf("Droid %s use weapon %s in a fight with droid %s\n", attack.getName(), this.typeOfWeapon, defend.getName());
    }


}
