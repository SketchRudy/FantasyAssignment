/**
 * Creation of a creature superclass, all other classes will inherit this / these constructors and methods
 */

package BaseClass;

public class Creature
{

    private String name;
    private int strength;
    private int healthPoints;

    // Empty Constructor
    public Creature() {
        this.name = "Unknown";
        this.strength = 1;
        this.healthPoints = 1;
    }

    /**
     * All subclasses inherit this constructor
     * @param name
     * @param strength
     */
    // Parameterized Constructor
    public Creature(String name, int strength)
    {
        this.name = name;
        this.strength = strength;
    }

    /**
     * @return getters / setting setters
     */
    // Setters and Getters
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getStrength()
    {
        if (strength >= 0)
        {
            return strength;
        } else
        {
            System.out.println("Strength must be non-negative");
        }
        return -1;
    }

    public void setStrength(int strength)
    {
        this.strength = strength;
    }

    public int getHealthPoints()
    {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints)
    {
        this.healthPoints = healthPoints;
    }

    /**
     *  Method uses Typecasting to convert double into int
     *  Since converting from double to int will round down, we need Strength + 1 to get the maximum damage output
     * @return calculation
     */
    public int getDamage()
    {
        int randomValue = (int)(Math.random() * strength);
        //System.out.println("Random Value before adding 1: " + randomValue);
        return (int)(randomValue + 1);
    }

    @Override
    public String toString()
    {
        return "Name: " + getName() +
                ", Strength: " + getStrength() +
                ", Health Points: " + getHealthPoints();
    }
}























