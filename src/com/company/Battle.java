package com.company;

import java.util.ArrayList;

import com.company.droids.Droid;

public class Battle {

    private ArrayList<Droid> first;
    private ArrayList<Droid> second;

    public Battle(ArrayList<Droid> first, ArrayList<Droid> second) {
        this.first = first;
        this.second = second;
    }

    public boolean firstTeamIsAlive(){
        for(int i = 0; i < this.first.size(); i++){
            if (!(this.first.get(i).droidAlive())){
                this.first.remove(i);
            }
        }
        if (this.first.isEmpty()){
            return false;
        }
        else {
            return true;
        }
    }

    public boolean secondTeamIsAlive(){
        for(int i = 0; i < this.second.size(); i++){
            if (!(this.second.get(i).droidAlive())){
                this.second.remove(i);
            }
        }
        if (this.second.isEmpty()){
            return false;
        }
        else {
            return true;
        }
    }

    public Droid choseFirstTeamDroid(){
        int firstSize;
        int f;
        firstSize = this.first.size();
        f = (int) (Math.random() * firstSize);
        if (f >= firstSize){
            f = firstSize - 1;
        }
        return this.first.get(f);
    }

    public Droid choseSecondTeamDroid(){
        int secondSize;
        int s;
        secondSize =this.second.size();
        s = (int) (Math.random() * secondSize);
        if (s >= secondSize){
            s = secondSize - 1;
        }
        return this.second.get(s);
    }

    public void startFight(){
        int i;
        Droid hitDroid;
        Droid defendDroid;
        i = (int) (Math.random() + 0.5);
        if (i == 0){

            hitDroid = this.choseFirstTeamDroid();
            defendDroid = this.choseSecondTeamDroid();
            hitDroid.makeDamage(defendDroid);
            System.out.println("Droid " + hitDroid.getName() +
                    " hits droid " + defendDroid.getName());
            hitDroid.powerUsed(defendDroid);
            hitDroid.weaponUsed(hitDroid, defendDroid);
        }
        else if (i == 1){
            hitDroid = this.choseSecondTeamDroid();
            defendDroid = this.choseFirstTeamDroid();
            hitDroid.makeDamage(defendDroid);
            System.out.println("Droid " + hitDroid.getName() +
                    " hits droid " + defendDroid.getName());
            hitDroid.powerUsed(defendDroid);
            hitDroid.weaponUsed(hitDroid, defendDroid);
        }
    }


    public void startBattle(){
        int round = 1;

        while (this.firstTeamIsAlive() | this.secondTeamIsAlive()){

            System.out.println("Round № " + round);

            this.startFight();
            if (!this.firstTeamIsAlive()){
                System.out.println("Second team won:");
                this.printSecondTeam();
                return;
            }
            if (!this.secondTeamIsAlive()){
                System.out.println("First team won:");
                this.printFirstTeam();
                return;
            }
            System.out.println("First team:");
            this.printFirstTeam();
            System.out.println("Second team:");
            this.printSecondTeam();
            round++;
        }
    }

    public void printFirstTeam(){
        for (Droid droid : this.first) {
            droid.printDroid();
        }

    }

    public void printSecondTeam() {
        for (Droid droid : this.second) {
            droid.printDroid();
        }
    }

}