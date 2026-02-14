package rpg.equipment.types;

import rpg.equipment.Armor;

public class LeatherArmor implements Armor {

    @Override
    public String getDescription() {
        return "Leather Armor";
    }

    @Override
    public int getDefense() {
        return 30;
    }
}