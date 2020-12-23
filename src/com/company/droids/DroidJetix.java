package com.company.droids;

public class DroidJetix extends Droid {

    public DroidJetix() {
        super.setDroidtype("Jetix");
    }








    @Override
    public void useExtraPower(Droid defend) {
        super.useExtraPower(defend);
        this.makeDamage(defend);
        this.setAdditionalProtect(this.getAdditionalProtect()+25);
        this.setHealth(defend.getHealth()-35);
    }
}