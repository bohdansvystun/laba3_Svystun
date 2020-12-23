package com.company.droids;

public class DroidMega extends Droid {

    public DroidMega() {
        super.setTypeOfDroid("Mega");
    }







    @Override
    public void useUltraPower(Droid defend) {
        super.useUltraPower(defend);
        this.makeHit(defend);
    }
}