package rpg.characters.types;

import rpg.characters.BaseCharacter;

public class Warrior extends BaseCharacter {

    public Warrior(String name) {
        super(name, 150, 30, 80, 20);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " uses Powerful Strike!");
    }
}