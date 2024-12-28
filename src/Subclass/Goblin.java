package Subclass;
import BaseClass.Creature;

public class Goblin extends Creature
{

    // DEFAULT constructor
    public Goblin()
    {
        super();
    }

    /**
     * Blueprint for goblin creature
     * @param name
     * @param strength
     */
    public Goblin(String name, int strength)
    {
        super(name, strength);
    }

    /**
     * Elves and Goblins inflict rando num between 0 and strength / 2
     * @return
     */
    public int getDamage()
    {
        return super.getDamage() / 2;
    }

}