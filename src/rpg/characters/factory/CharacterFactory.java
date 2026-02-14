package rpg.characters.factory;

import rpg.characters.Character;

public abstract class CharacterFactory {
    public abstract Character createCharacter(String name);
}