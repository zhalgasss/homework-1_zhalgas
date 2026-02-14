package rpg.equipment.factory;

import rpg.equipment.*;
import rpg.equipment.types.*;

public class MedievalEquipmentFactory implements EquipmentFactory {

    @Override
    public Weapon createWeapon() {
        return new Sword();
    }

    @Override
    public Armor createArmor() {
        return new PlateArmor();
    }
}