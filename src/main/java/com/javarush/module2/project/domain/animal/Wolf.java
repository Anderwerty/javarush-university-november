package com.javarush.module2.project.domain.animal;

import com.javarush.module2.project.annotation.AnimalBaseSettings;
import com.javarush.module2.project.domain.BaseSettings;
import com.javarush.module2.project.domain.Settings;

import java.util.Map;

@AnimalBaseSettings(value1 = 50, value2 = 30, value3 = 3, value4 = 8) //??
public class Wolf extends Predator {
    public Wolf() {
        super(BaseSettings.WOLF_BASE_SETTING);
    }

    @Override
    protected Map<Class<? extends Animal>, Integer> getVictimsByProbability() {
        return Settings.animalToTable.get(getClass());
    }
}
