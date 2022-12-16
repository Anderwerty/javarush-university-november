package com.javarush.module2.project.domain;

import com.javarush.module2.project.domain.animal.Animal;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Location {
    private Coordinates coordinates;

    private List<Plant> plants;
    private Set<Animal> animals;
    private Map<Class<? extends Animal>, Set<? extends Animal>> animals1;

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    public void addAnimal(Animal animal) {
        // check ?

    }

    public boolean canAnimalBeAdded(Animal animal) {
        return false;
    }
}
