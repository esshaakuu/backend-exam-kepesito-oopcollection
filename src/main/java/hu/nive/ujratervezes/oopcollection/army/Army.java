package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;

public class Army {
    List<MilitaryUnit> militaryUnits = new ArrayList<>();

    public List<MilitaryUnit> getMilitaryUnits() {
        return militaryUnits;
    }

    public void addUnit(MilitaryUnit militaryUnit) {
        militaryUnits.add(militaryUnit);

    }

    public void damageAll(int damage) {
        List<MilitaryUnit> deadUnits = new ArrayList<>();
        for (MilitaryUnit militaryUnit : militaryUnits) {
            militaryUnit.sufferDamage(damage);
            if (militaryUnit.getHitPoints()<25) {
                deadUnits.add(militaryUnit);
            }
        }
        militaryUnits.removeAll(deadUnits);
    }

    public int getArmyDamage() {
        int actualArmyDamage=0;
        for (MilitaryUnit militaryUnit : militaryUnits) {
            actualArmyDamage = actualArmyDamage + militaryUnit.doDamage();
        }
        return actualArmyDamage;
    }

    public int getArmySize() {
        return militaryUnits.size();
    }
}