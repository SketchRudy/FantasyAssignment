/**
 * Represents a Human, a type of creature with no special damage calculation.
 */
package Subclass;
import BaseClass.Creature;

public class Human extends Creature {
    // Default constructor
    public Human() {
        super();
    }

    /**
     * Blueprint for human creature
     * @param name The name of the Human
     * @param strength The strength of the Human
     */
    // Parameterized constructor
    public Human(String name, int strength) {
        super(name, strength);
    }

    /**
     * Calculates the damage dealt by the Human.
     * Humans get regular damage - nothing special - inherited from creature
     * @return The calculated damage
     */
    @Override
    public int getDamage() {
        return super.getDamage();
    }

}