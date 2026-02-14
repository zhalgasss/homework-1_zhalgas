package rpg.equipment.types;

import rpg.equipment.Armor;

public class Robe implements Armor {

    @Override
    public String getDescription() {
        return "Magic Robe";
    }

    @Override
    public int getDefense() {
        return 20;
    }
}