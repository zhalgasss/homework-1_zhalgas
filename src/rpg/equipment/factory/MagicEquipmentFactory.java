package rpg.equipment.factory;

import rpg.equipment.*;
import rpg.equipment.types.*;

public class MagicEquipmentFactory implements EquipmentFactory {

    @Override
    public Weapon createWeapon() {
        return new Staff();
    }

    @Override
    public Armor createArmor() {
        return new Robe();
    }
}