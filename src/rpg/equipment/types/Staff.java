package rpg.equipment.types;

import rpg.equipment.Weapon;

public class Staff implements Weapon {

    @Override
    public String getDescription() {
        return "Magic Staff";
    }

    @Override
    public int getPower() {
        return 60;
    }
}