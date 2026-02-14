package rpg.equipment.types;

import rpg.equipment.Weapon;

public class Bow implements Weapon {

    @Override
    public String getDescription() {
        return "Bow";
    }

    @Override
    public int getPower() {
        return 45;
    }
}