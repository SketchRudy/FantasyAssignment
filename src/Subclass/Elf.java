/**
 * Represents an Elf, a type of creature with specialized damage calculation.
 */
package Subclass;
import BaseClass.Creature;

public class Elf extends Creature {
    // Default constructor used from Creature
    public Elf() {
        super();
    }

    /**
     * Blueprint for elf creature
     * @param name the name of the Elf
     * @param strength strength the strength of the Elf
     */
    // Parameterized constructor
    public Elf(String name, int strength) {
        // Covers parameters used in Creature Baseclass
        super(name, strength);
    }

    /**
     * Calculates the damage dealt by the Elf.
     * Elves and Goblins inflict rando num between 0 and strength / 2
     * @return the calculated damage
     */
    // Get Damage from Creature baseclass, then divide by two for the species damage
    @Override
    public int getDamage() {
        return super.getDamage() / 2;
    }
}