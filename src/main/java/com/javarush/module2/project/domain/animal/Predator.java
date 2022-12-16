package com.javarush.module2.project.domain.animal;

import com.javarush.module2.project.domain.BaseSettings;
import com.javarush.module2.project.domain.Location;
import com.javarush.module2.project.utility.ProbabilityProvider;

import java.util.Map;
import java.util.Optional;

public abstract class Predator extends Animal {
    public Predator(BaseSettings baseSettings) {
        super(baseSettings);
    }

    @Override
    public void eat(Location location) {

        Map<Class<? extends Animal>, Integer> victimsByProbability = getVictimsByProbability();

        Optional<Animal> firstVictim = findFirstVictim(location, victimsByProbability);

        if (firstVictim.isPresent()) {
            Animal animal = firstVictim.get();
            boolean isEaten = ProbabilityProvider.isProbable(victimsByProbability.get(animal.getClass()));
            if (isEaten) {
                this.increaseSatiety(animal.getBaseSettings().getValue1());
                location.removeAnimal(animal);
            }
        }
    }

    protected abstract Map<Class<? extends Animal>, Integer> getVictimsByProbability();


    private Optional<Animal> findFirstVictim(Location location, Map<Class<? extends Animal>, Integer> victimsByProbability) {

        //
        return null;
    }
}
