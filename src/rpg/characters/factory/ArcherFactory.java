package rpg.characters.factory;

import rpg.characters.Character;
import rpg.characters.types.Archer;

public class ArcherFactory extends CharacterFactory {

    @Override
    public Character createCharacter(String name) {
        return new Archer(name);
    }
}