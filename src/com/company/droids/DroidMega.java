package com.company.droids;

public class DroidMega extends Droid {

    public DroidMega() {
        super.setDroidtype("Mega");
    }







    @Override
    public void useExtraPower(Droid defend) {
        super.useExtraPower(defend);
        this.makeDamage(defend);
    }
}