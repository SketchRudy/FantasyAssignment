package Subclass;
import BaseClass.Creature;

public class Human extends Creature
{
    // Default constructor
    public Human()
    {
        super();
    }

    /**
     * Blueprint for human creature
     * @param name
     * @param strength
     */
    // Parameterized constructor
    public Human(String name, int strength)
    {
        super(name, strength);
    }

    /**
     * Humans get regular damage - nothing special - inherited from creature
     * @return
     */
    public int getDamage()
    {
        return super.getDamage();
    }

}