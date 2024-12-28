/**
 * Two subclasses will further inherit this subclass and everything above it.
 */

package Subclass;
import BaseClass.Creature;

public class Demon extends Creature {
    private String planeOfExistence;

    // Default constructor
    public Demon() {
        super();
        this.planeOfExistence = "Hades"; // Default plane of existence
    }

    /**
     * Creates a Demon instance with specific attributes.
     * @param name Name of the demon
     * @param strength The strength of the demon
     * @param planeOfExistence the plane of existence the demon resides in
     */
    public Demon(String name, int strength, String planeOfExistence) {
        super(name, strength);
        this.planeOfExistence = planeOfExistence;
    }

    /**
     * Gets the plane of existence of the demon.
     * @return the plane of existence
     */
    public String getPlaneOfExistence() {
        return planeOfExistence;
    }

    /**
     * Sets the plane of existence of the demon.
     * @param planeOfExistence the new plane of existence
     */
    public void setPlaneOfExistence(String planeOfExistence) {
        this.planeOfExistence = planeOfExistence;
    }

    /**
     * Provides a string representation of the demon, including its name, strength, health points,
     * species, and plane of existence.
     * @return the string representation of the demon
     */
    @Override
    public String toString() {
        return super.toString() +
                ", Species: " + getClass().getSimpleName() +
                ", Plane of Existence: " + getPlaneOfExistence();
    }

}