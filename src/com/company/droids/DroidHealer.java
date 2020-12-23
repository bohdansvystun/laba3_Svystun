package com.company.droids;

public class DroidHealer extends Droid {

    public DroidHealer() {
        super.setDroidtype("Healer");
    }









    @Override
    public void useExtraPower(Droid defend) {
        super.useExtraPower(defend);
        this.setHealth(defend.getHealth()+40);
    }
}