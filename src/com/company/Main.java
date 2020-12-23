package com.company;

import java.util.Scanner;
import java.util.ArrayList;

import com.company.droids.Droid;
import com.company.droids.DroidMega;
import com.company.droids.DroidUltra;
import com.company.droids.DroidHealer;
import com.company.droids.DroidJetix;


public class Main {
    public static void main(String[] args) {
        int firstQuantity, secondQuantity;
        ArrayList<Droid> firstTeam = new ArrayList<>();
        ArrayList<Droid> secondTeam = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.print("Good Luck!\n");
        System.out.print("Enter the amount of players in first team:\t");
        firstQuantity = in.nextInt();
        for (int i = 0; i < firstQuantity; i++){
            System.out.print("Choose the type of droid:\n" +
                    "-------------\n" +
                    "|1 - Mega   |\n" +
                    "|2 - Healer |\n" +
                    "|3 - Ultra  |\n" +
                    "|4 - Jetix  |\n" +
                    "-------------\n" );
            int type = in.nextInt();
            if (type == 1){
                firstTeam.add(new DroidMega());
            }
            else if (type == 2){
                firstTeam.add(new DroidHealer());
            }
            else if (type == 3){
                firstTeam.add(new DroidUltra());
            }
            else if (type == 4){
                firstTeam.add(new DroidJetix());
            }
            else{
                System.out.print("The type of droid doesn't exist:\n");
                firstTeam.add(new Droid());
            }
        }
        System.out.print("Enter the amount of players in second team:\t");
        secondQuantity = in.nextInt();
        for (int i = 0; i < secondQuantity; i++){
            System.out.print("Choose the type of droid:\n" +
                    "-------------\n" +
                    "|1 - Mega   |\n" +
                    "|2 - Healer |\n" +
                    "|3 - Ultra  |\n" +
                    "|4 - Jetix  |\n" +
                    "-------------\n" );
            int type = in.nextInt();
            if (type == 1){
                secondTeam.add(new DroidMega());
            }
            else if (type == 2){
                secondTeam.add(new DroidHealer());
            }
            else if (type == 3){
                secondTeam.add(new DroidUltra());
            }
            else if (type == 4){
                secondTeam.add(new DroidJetix());
            }
            else{
                System.out.print("The type of droid doesn't exist:\n");
                secondTeam.add(new Droid());
            }
        }
        Battle battle = new Battle(firstTeam , secondTeam);
        System.out.println("|\tName\t|\tType\t|\tWeapon\t|\tHealth\t|\tDamage\t|\tProtection\t|");
        battle.startBattle();


    }
}
