package rpg.characters;

public abstract class BaseCharacter implements Character {

    protected String name;
    protected int health;
    protected int mana;
    protected int strength;
    protected int intelligence;

    public BaseCharacter(String name, int health, int mana, int strength, int intelligence) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.strength = strength;
        this.intelligence = intelligence;
    }

    @Override
    public String getStats() {
        return "Name: " + name +
                ", Health: " + health +
                ", Mana: " + mana +
                ", Strength: " + strength +
                ", Intelligence: " + intelligence;
    }
}