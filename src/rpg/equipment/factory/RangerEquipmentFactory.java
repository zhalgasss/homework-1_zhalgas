package rpg.equipment.factory;

import rpg.equipment.*;
import rpg.equipment.types.*;

public class RangerEquipmentFactory implements EquipmentFactory {

    @Override
    public Weapon createWeapon() {
        return new Bow();
    }

    @Override
    public Armor createArmor() {
        return new LeatherArmor();
    }
}