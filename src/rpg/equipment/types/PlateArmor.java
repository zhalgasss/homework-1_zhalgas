package rpg.equipment.types;

import rpg.equipment.Armor;

public class PlateArmor implements Armor {

    @Override
    public String getDescription() {
        return "Plate Armor";
    }

    @Override
    public int getDefense() {
        return 50;
    }
}