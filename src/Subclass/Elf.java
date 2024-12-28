package Subclass;
import BaseClass.Creature;

public class Elf extends Creature
{

    // Default constructor used from Creature
    public Elf()
    {
        super();
    }

    /**
     * Blueprint for elf creature
     * @param name
     * @param strength
     */
    // Parameterized constructor
    public Elf(String name, int strength)
    {
        // Covers parameters used in Creature Baseclass
        super(name, strength);
    }

    /**
     * Elves and Goblins inflict rando num between 0 and strength / 2
     * @return
     */
    // Get Damage from Creature baseclass, then divide by two for the species damage
    public int getDamage()
    {
        return super.getDamage() / 2;
    }
}