package Subclasstwo;
import Subclass.Demon;
import java.util.Random;

public class Cyberdemon extends Demon {
    // Default constructor
    public Cyberdemon() {
        super();
    }

    /**
     * Blueprint for another Demon subclass
     * @param name The name of the Cyberdemon
     * @param strength The strength of the Cyberdemon
     * @param planeOfExistence The plane of existence where the Cyberdemon resides
     */
    public Cyberdemon(String name, int strength, String planeOfExistence) {
        super(name, strength, planeOfExistence);
    }

    /**
     * Calculates the damage dealt by the Cyberdemon.
     * Includes a 1% chance to inflict a critical hit dealing 1000 damage.
     * @return the calculated damage
     */
    @Override
    public int getDamage() {
        Random random = new Random();
        // 1% chance for critical hit
        if (random.nextDouble() < 0.01) {
            return 1000; // Critical hit damage
        } else {
            // Normal damage calculation from Creature class
            return super.getDamage();
        }
    }

    /**
     * @return The place of existence
     */
    public String getSpecies() {
        return getPlaneOfExistence();
    }

}