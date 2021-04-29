package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit{
    int attackCounter = 0;

    public HeavyCavalry() {
        this.setHitPoints(150);
        this.setAttackPoints(20);
        this.setArmor(true);
    }

    @Override
    public int doDamage(){
        this.attackCounter++;
        if (attackCounter==1) {
            return this.getAttackPoints()*3;
        } else {
            return this.getAttackPoints();
        }
    }
}