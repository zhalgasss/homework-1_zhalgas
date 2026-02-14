package rpg;

import rpg.characters.Character;
import rpg.characters.factory.*;
import rpg.equipment.factory.*;

public class Main {

    public static void main(String[] args) {
// mage

        Character mage = new MageFactory().createCharacter("Zhalgas");
        Character warrior = new WarriorFactory().createCharacter("Asanali");
        Character archer = new ArcherFactory().createCharacter("Adilkhan");

        System.out.println("");

        System.out.println(mage.getStats());
        System.out.println(warrior.getStats());
        System.out.println(archer.getStats());

        System.out.println("");

        mage.useSpecialAbility();
        warrior.useSpecialAbility();
        archer.useSpecialAbility();

        System.out.println("");

        EquipmentFactory mage1 = new MagicEquipmentFactory();
        EquipmentFactory warrior1 = new MedievalEquipmentFactory();
        EquipmentFactory archer1 = new RangerEquipmentFactory();

        System.out.println("Weapon: " +
                mage1.createWeapon().getDescription());

        System.out.println("Armor: " +
                mage1.createArmor().getDescription());

        System.out.println("");

        System.out.println("Weapon: " +
                warrior1.createWeapon().getDescription());

        System.out.println("Armor: " +
                warrior1.createArmor().getDescription());

        System.out.println("");

        System.out.println("Weapon: " +
                archer1.createWeapon().getDescription());

        System.out.println("Armor: " +
                archer1.createArmor().getDescription());
    }
}