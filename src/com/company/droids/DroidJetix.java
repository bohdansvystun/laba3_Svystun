package com.company.droids;

public class DroidJetix extends Droid {

    public DroidJetix() {
        super.setTypeOfDroid("Jetix");
    }








    @Override
    public void useUltraPower(Droid defend) {
        super.useUltraPower(defend);
        this.makeHit(defend);
        this.setProtection(this.getProtection()+25);
        this.setHealth(defend.getHealth()-35);
    }
}