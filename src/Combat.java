import BaseClass.Creature;

/**
 *
 * Fight between two creatures to the death, when one falls below 0hp, it's grave is made and the spoils go to the other
 */
public class Combat
{
     /**
      * Takes two parameters of creature type, makes them fight to the death. Took very long not to just to code, but the logic was 50% of it.
      *
      * @param creature1
      * @param creature2
      */
     public void fight(Creature creature1, Creature creature2)
     {

         System.out.printf("""
                  Fight started between:
                  %s (%dhp) and %s (%d hp)
                  """, creature1.getName(), creature1.getHealthPoints(), creature2.getName(), creature2.getHealthPoints());

          do {

               // Moved this method in do while loop to change attack dmg num every swing instead of staying constant if placed outside
               int creatureOneDamage = creature1.getDamage();
               int creatureTwoDamage = creature2.getDamage();

               //Prints "creature1 inflicted ?? damage" then subtracts creature2 health from dmg taken, rinse repeat until this loop ends when one hits 0
               // When either hits 0, stop the attacks. Checks are in-between attacks to make sure no one has fallen
               System.out.println(creature1.getName() + " inflicted " + creatureOneDamage + " damage");
               creature2.setHealthPoints(creature2.getHealthPoints() - creatureOneDamage);
               if (creature2.getHealthPoints() <=0 )
               {
                    System.out.println(creature2.getName() + " has fallen");
                    System.out.println(creature1.getName() + " has " + creature1.getHealthPoints() + "hp left");
                    System.out.println(creature1.getName() + " Has faced adversity and overcame death");
                    break;
               }

               System.out.println(creature2.getName() + " inflicted " + creatureTwoDamage + " damage");
               creature1.setHealthPoints(creature1.getHealthPoints() - creatureTwoDamage);
               if (creature1.getHealthPoints() <=0)
               {
                    System.out.println(creature1.getName() + " has fallen");
                    System.out.println(creature2.getName() + " has " + creature2.getHealthPoints() + "hp left");
                    System.out.println(creature2.getName() + " Has faced adversity and overcame death");
                    break;
               }


               System.out.println(creature1.getName() + " has " + creature1.getHealthPoints() + " health points remaining");
               System.out.println(creature2.getName() + " has " + creature2.getHealthPoints() + " health points remaining");
               System.out.println("--------------------------------------");

          } while (creature1.getHealthPoints() > 0 && creature2.getHealthPoints() > 0);

     }
}
