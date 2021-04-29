package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit  {
    private static int hitPoints;
    private static int attackPoints;
    private static boolean armor;

    protected MilitaryUnit() {
    }

    public int doDamage(){
        return this.getAttackPoints();
    }

    public void sufferDamage(int damage) {
        if (this.getArmor() == true) {
            this.setHitPoints(this.getHitPoints() - (damage/2));
        } else {
            this.setHitPoints(this.getHitPoints() - damage);
        }
    }

    public int getHitPoints() { return this.hitPoints;}

    public void setHitPoints(int lifePoints) { this.hitPoints = lifePoints;}

    public int getAttackPoints() { return this.attackPoints;}

    public void setAttackPoints( int attackPower) { this.attackPoints = attackPower;}

    public boolean getArmor() { return this.armor;}

    public void setArmor(boolean armor) { this.armor = armor;}
}
