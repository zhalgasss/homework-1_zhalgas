package rpg.characters.types;

import rpg.characters.BaseCharacter;

public class Archer extends BaseCharacter {

    public Archer(String name) {
        super(name, 110, 60, 65, 40);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " shoots a Precise Arrow!");
    }
}