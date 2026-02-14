package rpg.characters.types;

import rpg.characters.BaseCharacter;

public class Mage extends BaseCharacter {

    public Mage(String name) {
        super(name, 90, 150, 20, 90);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " casts Fireball!");
    }
}