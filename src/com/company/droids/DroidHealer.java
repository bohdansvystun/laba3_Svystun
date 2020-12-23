package com.company.droids;

public class DroidHealer extends Droid {

    public DroidHealer() {
        super.setTypeOfDroid("Healer");
    }









    @Override
    public void useUltraPower(Droid defend) {
        super.useUltraPower(defend);
        this.setHealth(defend.getHealth()+40);
    }
}