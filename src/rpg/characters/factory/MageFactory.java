package rpg.characters.factory;

import rpg.characters.Character;
import rpg.characters.types.Mage;

public class MageFactory extends CharacterFactory {

    @Override
    public Character createCharacter(String name) {
        return new Mage(name);
    }
}