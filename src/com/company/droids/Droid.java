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
    private int additionalprotect;
    private Weapon weapon;
    private String droidtype;


    public Droid() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name of your droid:\t");
        this.name = in.nextLine();
        this.weapon = chooseWeapon();
        this.health = 150;
        this.damage = 25;
        this.additionalprotect = 40;
        this.droidtype = "Typical";
    }

    @Override
    public String toString() {
        return "Droid{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", damage=" + damage +
                ", protection=" + additionalprotect +
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


    public int getAdditionalProtect() {
        return additionalprotect;
    }

    public void setAdditionalProtect(int protection) {
        this.additionalprotect = protection;
    }


    public String getDroidtype() {
        return droidtype;
    }

    public void setDroidtype(String droidtype) {
        this.droidtype = droidtype;
    }


    public boolean droidAlive(){
        return this.getHealth() > 0;
    }

    public Weapon chooseWeapon(){
        Scanner in = new Scanner(System.in);
        System.out.print("Choose weapon type:\n" +
                "-------------\n"+
                "|1 - Bayonet|\n" +
                "|2 - Treat  |\n" +
                "|3 - Defend |\n"+
                "|4 - Pistol |\n"+
                "------------- \n")
        ;
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

    public void useExtraPower(Droid defend){
        System.out.printf("Droid %s use ultra power against droid %s\n", this.name, defend.getName());
    }

    public void powerUsed(Droid defend){
        int numb;
        numb = (int) (Math.random() * 4);
        if(numb == 1){
            this.useExtraPower(defend);
        }
    }

    public void weaponUsed(Droid attack, Droid defend){
        int numb;
        numb = (int) (Math.random() * 3);
        if(numb == 1){
            this.weapon.useWeapon(attack, defend);
        }
    }

    public void makeDamage(Droid defend){
        if (defend.getAdditionalProtect() != 0){
            defend.setAdditionalProtect(defend.getAdditionalProtect() - this.getDamage());
            if (defend.getAdditionalProtect() < 0){
                defend.setHealth(defend.getHealth() + defend.getAdditionalProtect());
                defend.setAdditionalProtect(0);
            }
        }
        else {
            defend.setHealth(defend.getHealth() - this.getDamage());
        }
    }

    public void printDroid(){
        System.out.printf("|\t%-8s|\t%-8s|\t%-8s|\t%d\t\t|\t%d\t\t|\t%d\t\t\t|\n", this.getName(),
                this.getDroidtype(), this.getWeapon().getWeaponType(), this.getHealth(),
                this.getDamage(), this.getAdditionalProtect());
    }
}
