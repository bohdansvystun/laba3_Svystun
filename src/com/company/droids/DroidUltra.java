package com.company.droids;

public class DroidUltra extends Droid {

    public DroidUltra() {
        super.setTypeOfDroid("Ultra");
    }







    @Override
    public void useUltraPower(Droid defend) {
        super.useUltraPower(defend);
        this.setProtection(this.getProtection()+70);
    }
}