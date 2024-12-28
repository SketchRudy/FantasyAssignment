/**
 * Represents a Goblin, a type of creature with specialized damage calculation.
 */
package Subclass;
import BaseClass.Creature;

public class Goblin extends Creature {
    // DEFAULT constructor
    public Goblin() {
        super();
    }

    /**
     * Blueprint for goblin creature
     * @param name The name of the Goblin
     * @param strength The strength of the Goblin
     */
    public Goblin(String name, int strength) {
        super(name, strength);
    }

    /**
     * Calculates the damage dealt by the Goblin.
     * Elves and Goblins inflict rando num between 0 and strength / 2
     * @return the calculated damage
     */
    @Override
    public int getDamage() {
        return super.getDamage() / 2;
    }

}