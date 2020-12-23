package com.company.droids;

import java.util.Scanner;

import com.company.weapon.Weapon;
import com.company.weapon.WeaponTreat;
import com.company.weapon.WeaponPistol;
import com.company.weapon.WeaponDefend;
import com.company.weapon.WeaponBayonet;

public class Droid {

    private String name;
    private int health;
    private int damage;
    private int protection;
    private Weapon weapon;
    private String typeOfDroid;


    public Droid() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name of your droid:\t");
        this.name = in.nextLine();
        this.weapon = chooseWeapon();
        this.health = 150;
        this.damage = 25;
        this.protection = 40;
        this.typeOfDroid = "Typical";
    }

    @Override
    public String toString() {
        return "Droid{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", damage=" + damage +
                ", protection=" + protection +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }


    public String getTypeOfDroid() {
        return typeOfDroid;
    }

    public void setTypeOfDroid(String typeOfDroid) {
        this.typeOfDroid = typeOfDroid;
    }


    public boolean droidIsAlive(){
        return this.getHealth() > 0;
    }

    public Weapon chooseWeapon(){
        Scanner in = new Scanner(System.in);
        System.out.print("Виберіть зброю:\n" +
                "1 - Bayonet\n" +
                "2 - Treat\n" +
                "3 - Defend\n"+
                "4 - Pistol\n");
        int type = in.nextInt();

        if (type == 1){
            return new WeaponBayonet();
        }
        else if (type == 2){
            return new WeaponTreat();
        }
        else if (type == 3){
            return new WeaponDefend();
        }
        else if (type == 4){
            return new WeaponPistol();
        }
        else {
            System.out.print("This weapon doesn't exist:\n");
            return new Weapon();
        }

    }

    public void useUltraPower(Droid defend){
        System.out.printf("Droid %s use ultra power against droid %s\n", this.name, defend.getName());
    }

    public void powerIsUsed(Droid defend){
        int numb;
        numb = (int) (Math.random() * 4);
        if(numb == 1){
            this.useUltraPower(defend);
        }
    }

    public void weaponIsUsed(Droid attack, Droid defend){
        int numb;
        numb = (int) (Math.random() * 3);
        if(numb == 1){
            this.weapon.useWeapon(attack, defend);
        }
    }

    public void makeHit(Droid defend){
        if (defend.getProtection() != 0){
            defend.setProtection(defend.getProtection() - this.getDamage());
            if (defend.getProtection() < 0){
                defend.setHealth(defend.getHealth() + defend.getProtection());
                defend.setProtection(0);
            }
        }
        else {
            defend.setHealth(defend.getHealth() - this.getDamage());
        }
    }

    public void printDroid(){
        System.out.printf("|\t%-8s|\t%-8s|\t%-8s|\t%d\t\t|\t%d\t\t|\t%d\t\t\t|\n", this.getName(),
                this.getTypeOfDroid(), this.getWeapon().getTypeOfWeapon(), this.getHealth(),
                this.getDamage(), this.getProtection());
    }
}
