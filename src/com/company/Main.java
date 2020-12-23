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
        int firstAmount, secondAmount;
        ArrayList<Droid> firstTeamOfDroid = new ArrayList<>();
        ArrayList<Droid> secondTeamOfDroid = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount of players in first team:\t");
        firstAmount = in.nextInt();
        for (int i = 0; i < firstAmount; i++){
            System.out.print("Choose the type of droid:\n" +
                    "1 - Mega\n" +
                    "2 - Healer\n" +
                    "3 - Ultra\n" +
                    "4 - Jetix\n");
            int type = in.nextInt();
            if (type == 1){
                firstTeamOfDroid.add(new DroidMega());
            }
            else if (type == 2){
                firstTeamOfDroid.add(new DroidHealer());
            }
            else if (type == 3){
                firstTeamOfDroid.add(new DroidUltra());
            }
            else if (type == 4){
                firstTeamOfDroid.add(new DroidJetix());
            }
            else{
                System.out.print("The type of droid doesn't exist:\n");
                firstTeamOfDroid.add(new Droid());
            }
        }
        System.out.print("Enter the amount of players in second team:\t");
        secondAmount = in.nextInt();
        for (int i = 0; i < secondAmount; i++){
            System.out.print("Choose the type of droid:\n" +
                    "1 - Mega\n" +
                    "2 - Healer\n" +
                    "3 - Ultra\n" +
                    "4 - Jetix\n");
            int type = in.nextInt();
            if (type == 1){
                secondTeamOfDroid.add(new DroidMega());
            }
            else if (type == 2){
                secondTeamOfDroid.add(new DroidHealer());
            }
            else if (type == 3){
                secondTeamOfDroid.add(new DroidUltra());
            }
            else if (type == 4){
                secondTeamOfDroid.add(new DroidJetix());
            }
            else{
                System.out.print("The type of droid doesn't exist:\n");
                secondTeamOfDroid.add(new Droid());
            }
        }
        Battle battle = new Battle(firstTeamOfDroid , secondTeamOfDroid);
        System.out.println("|\tName\t|\tType\t|\tWeapon\t|\tHealth\t|\tDamage\t|\tProtection\t|");
        battle.startBattle();


    }
}
