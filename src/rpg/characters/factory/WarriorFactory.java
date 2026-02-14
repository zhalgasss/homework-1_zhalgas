package rpg.characters.factory;

import rpg.characters.Character;
import rpg.characters.types.Warrior;

public class WarriorFactory extends CharacterFactory {

    @Override
    public Character createCharacter(String name) {
        return new Warrior(name);
    }
}