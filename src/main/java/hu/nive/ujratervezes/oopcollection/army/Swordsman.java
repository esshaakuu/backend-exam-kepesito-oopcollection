package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit {
    boolean shield = true;

    public Swordsman(boolean armor){
        this.setHitPoints(100);
        this.setAttackPoints(10);
        this.setArmor(armor);
    }

    @Override
    public void sufferDamage(int damage) {
        if (this.shield = true) {
            this.shield = false;
        } else {
            if (this.getArmor() == true) {
                this.setHitPoints(this.getHitPoints() - (damage / 2));
            } else {
                this.setHitPoints(this.getHitPoints() - damage);
            }
        }
    }
}