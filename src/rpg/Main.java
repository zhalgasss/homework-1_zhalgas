package rpg;

import rpg.characters.Character;
import rpg.characters.factory.*;
import rpg.equipment.factory.*;

public class Main {

    public static void main(String[] args) {

        CharacterFactory factory = new MageFactory();
        Character character = factory.createCharacter("Gandalf");

        System.out.println(character.getStats());
        character.useSpecialAbility();

        EquipmentFactory equipmentFactory = new MagicEquipmentFactory();

        System.out.println("Weapon: " +
                equipmentFactory.createWeapon().getDescription());

        System.out.println("Armor: " +
                equipmentFactory.createArmor().getDescription());
    }
}