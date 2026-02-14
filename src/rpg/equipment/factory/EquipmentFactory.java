package rpg.equipment.factory;

import rpg.equipment.Weapon;
import rpg.equipment.Armor;

public interface EquipmentFactory {
    Weapon createWeapon();
    Armor createArmor();
}