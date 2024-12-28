/**
 * Two subclasses will further inherit this subclass and everything above it.
 */

package Subclass;
import BaseClass.Creature;

public class Demon extends Creature
{
    private String planeOfExistence;

    // Default constructor
    public Demon()
    {
        super();
        this.planeOfExistence = "Hades"; // Default plane of existence
    }

    /**
     * @param name
     * @param strength
     * @param planeOfExistence
     */
    public Demon(String name, int strength, String planeOfExistence)
    {
        super(name, strength);
        this.planeOfExistence = planeOfExistence;
    }

    /**
     * @return the place it comes from
     */
    public String getPlaneOfExistence()
    {
        return planeOfExistence;
    }

    /**
     * Choose the place it comes from
     * @param planeOfExistence
     */
    public void setPlaneOfExistence(String planeOfExistence)
    {
        this.planeOfExistence = planeOfExistence;
    }

    @Override
    public String toString()
    {
        return super.toString() +
                ", Species: " + getClass().getSimpleName() +
                ", Plane of Existence: " + getPlaneOfExistence();
    }

}