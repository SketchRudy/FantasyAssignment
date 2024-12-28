/**
 * Creation of a creature superclass, all other classes will inherit this / these constructors and methods
 */
package BaseClass;

public class Creature {

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
     * @param name of the creature
     * @param strength of the creature
     */
    // Parameterized Constructor
    public Creature(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    /**
     * @return getters / setting setters
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the creature.
     * @param name Set the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the strength of the creature. Ensures non-negative values.
     * @return the strength or -1 if invalid
     */
    public int getStrength() {
        if (strength >= 0) {
            return strength;
        } else {
            System.out.println("Strength must be non-negative");
        }
        return -1;
    }

    /**
     * Sets the strength of the creature.
     * @param strength The strength of the creature
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * Gets the health points of the creature.
     * @return the health points
     */
    public int getHealthPoints() {
        return healthPoints;
    }

    /**
     * Sets the health points of the creature.
     * @param healthPoints the health points of the creature
     */
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    /**
     *  Method uses Typecasting to convert double into int
     *  Since converting from double to int will round down, we need Strength + 1 to get the maximum damage output
     * @return calculation
     */
    public int getDamage() {
        int randomValue = (int)(Math.random() * strength);
        //System.out.println("Random Value before adding 1: " + randomValue);
        return randomValue + 1;
    }

    /**
     * Provides a string representation of the creature, including its name, strength, and health points.
     * @return the string representation
     */
    @Override
    public String toString() {
        return "Name: " + getName() +
                ", Strength: " + getStrength() +
                ", Health Points: " + getHealthPoints();
    }
}