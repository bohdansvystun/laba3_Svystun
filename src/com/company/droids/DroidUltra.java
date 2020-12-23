package com.company.droids;

public class DroidUltra extends Droid {

    public DroidUltra() {
        super.setDroidtype("Ultra");
    }







    @Override
    public void useExtraPower(Droid defend) {
        super.useExtraPower(defend);
        this.setAdditionalProtect(this.getAdditionalProtect()+70);
    }
}