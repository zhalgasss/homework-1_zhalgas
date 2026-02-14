package rpg.equipment.types;

import rpg.equipment.Weapon;

public class Sword implements Weapon {

    @Override
    public String getDescription() {
        return "Sword";
    }

    @Override
    public int getPower() {
        return 40;
    }
}