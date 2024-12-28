/**
 * @Author: Rudolf Sirbu
 * @Version: 1.0?
 */

import BaseClass.Creature;
import Subclass.Demon;
import Subclass.Elf;
import Subclass.Goblin;
import Subclass.Human;
import Subclasstwo.Balrog;
import Subclasstwo.Cyberdemon;
import java.util.ArrayList;

public class Fantasy
{

    public static void main(String[] args)
    {
        // Creates an array of creatures
        ArrayList < Creature > creatures = new ArrayList < > ();
        creatures.add(new Demon("Destroyer Hades", 20, "Underworld"));
        creatures.add(new Demon());
        creatures.add(new Elf("Riven", 25));
        creatures.add(new Elf());
        creatures.add(new Goblin("Wibbaang", 2));
        creatures.add(new Goblin());
        creatures.add(new Human("Sir Arthur", 15));
        creatures.add(new Human());
        creatures.add(new Balrog("BalJoy", 11, "Underworld" ));
        creatures.add(new Balrog());
        creatures.add(new Cyberdemon("Cyber delinquent", 11, "Unknown" ));
        creatures.add(new Cyberdemon());

        // iterates through the array and prints the damage they output in a strike
        for (Creature creature: creatures)
        {
            System.out.println(creature);
            System.out.println("Creature Damage: " + creature.getDamage());
            System.out.println();
        }

        Creature Hades = creatures.get(0);
        Hades.setHealthPoints(200);

        Creature Riven = creatures.get(2);
        Riven.setHealthPoints(75);
        Riven.setStrength(55);

        Creature Wibbaang = creatures.get(4);
        Wibbaang.setHealthPoints(999);
        Wibbaang.setStrength(999);
        Wibbaang.setName("Boss: Goblin King");

        Creature Sir_Arthur = creatures.get(6);
        Sir_Arthur.setHealthPoints(100);
        Sir_Arthur.setStrength(25);

        Creature BalJoy = creatures.get(8);
        BalJoy.setHealthPoints(100);

        Cyberdemon myCyberdemon = new Cyberdemon();
        Creature Cyber = creatures.get(10);
        Cyber.setHealthPoints(100);
        myCyberdemon.setPlaneOfExistence("Afterworld");


        // Combat between Riven and Sir Arthur, uses Combat class
        // Make the outcome 50/50 despite the damage differences and health differences
        Combat battle = new Combat();
        battle.fight(Riven, Sir_Arthur);
        System.out.println();

    }

}