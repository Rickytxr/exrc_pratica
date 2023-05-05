package foxrabbitsv1;

import java.awt.color.ICC_ColorSpace;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Onca extends Animal {
    // Characteristics shared by all foxes (class variables).

    // The age at which a fox can start to breed.
    private static final int BREEDING_AGE = 15;
    // The age to which a fox can live.
    private static final int MAX_AGE = 150;
    // The likelihood of a fox breeding.
    private static final double BREEDING_PROBABILITY = 0.08;
    // The maximum number of births.
    private static final int MAX_LITTER_SIZE = 2;
    // The food value of a single rabbit. In effect, this is the
    // number of steps a fox can go before it has to eat again.
    private static final int RABBIT_FOOD_VALUE = 9;
    // A shared random number generator to control breeding.
    private static final int FOX_FOOD_VALUE = 9;
    private static final Random rand = Randomizer.getRandom();

    // Individual characteristics (instance fields).

    // The fox's age.
    private int age;
    // Whether the fox is alive or not.

    private int foodLevel;

    public Onca(boolean randomAge, Campo field, Localizacao location) {
        super(field, location);
        if (randomAge) {
            age = rand.nextInt(MAX_AGE);
            foodLevel = rand.nextInt(RABBIT_FOOD_VALUE);
        } else {
            age = 0;
            // leave age at 0
            foodLevel = rand.nextInt(FOX_FOOD_VALUE);
        }
    }

    private void incrementAge() {
        age++;
        if (age > MAX_AGE) {
            setDead();
        }
    }

    private void incrementHunger() {
        foodLevel--;
        if (foodLevel <= 0) {
            setDead();
        }
    }

    private Localizacao findFood() {
        List<Localizacao> adjacent = getField().adjacentLocations(getLocation());
        Iterator<Localizacao> it = adjacent.iterator();
        while (it.hasNext()) {
            Localizacao where = it.next();
            Object animal = getField().getObjectAt(where);
            if (animal instanceof Coelho) {
                Coelho rabbit = (Coelho) animal;
                if (rabbit.isAlive()) {
                    rabbit.setDead();
                    foodLevel = RABBIT_FOOD_VALUE;
                    return where;
                } else if (animal instanceof Raposa) {
                    Raposa fox = (Raposa) animal;
                    if (fox.isAlive()) {
                        fox.setDead();
                        foodLevel = FOX_FOOD_VALUE;
                        return where;
                    }
                }
            }

        }
        return null;
    }

    private void giveBirth(List<Animal> newRaposas)
    {
        // New foxes are born into adjacent locations.
        // Get a list of adjacent free locations.
        List<Localizacao> free = getField().getFreeAdjacentLocations(getLocation());
        int births = breed();
        for(int b = 0; b < births && free.size() > 0; b++) {
            Localizacao loc = free.remove(0);
            Onca young = new Onca(false, getField(), loc) {
            };
            newRaposas.add(young);
        }
    }
    private int breed()
    {
        int births = 0;
        if(canBreed() && rand.nextDouble() <= BREEDING_PROBABILITY) {
            births = rand.nextInt(MAX_LITTER_SIZE) + 1;
        }
        return births;
    }

    private boolean canBreed()
    {
        return age >= BREEDING_AGE;
    }

    @Override
    public void act(List<Animal> newAnimals) {
        incrementAge();
        incrementHunger();
        if(isAlive()) {
            giveBirth(newAnimals);
            // Move towards a source of food if found.
            Localizacao newLocation = findFood();
            if(newLocation == null) {
                // No food found - try to move to a free location.
                newLocation = getField().freeAdjacentLocation(getLocation());
            }
            // See if it was possible to move.
            if(newLocation != null) {
                setLocation(newLocation);
            }
            else {
                // Overcrowding.
                setDead();
            }
        }
    }
}