package Subclasstwo;
import Subclass.Demon;
import java.util.Random;


public class Balrog extends Demon
{
    // Default constructor
    public Balrog() {}

    /**
     * Blueprint for Demon subclass
     * @param name
     * @param strength
     * @param planeOfExistence
     */
    // Parameterized constructor
    public Balrog(String name, int strength, String planeOfExistence)
    {
        super(name, strength, planeOfExistence);

    }

    /**
     * @return the damage for this demon species, has crit chance
     */
    public int getDamage()
    {
        Random random = new Random();
        // 1% chance for critical hit
        if (random.nextDouble() < 0.01)
        {
            return 1000; // Critical hit damage
        }
        else
        {
            // Normal damage calculation from Creature class
            return super.getDamage();
        }
    }

    /**
     *
     * @return the place it came from
     */
    public String getSpecies()
    {
        return getPlaneOfExistence();
    }

}
