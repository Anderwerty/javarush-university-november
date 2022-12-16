package com.javarush.module2.project.domain.animal;

import com.javarush.module2.project.domain.BaseSettings;
import com.javarush.module2.project.domain.Direction;
import com.javarush.module2.project.domain.Location;

public abstract class Animal {
    private final BaseSettings baseSettings;
    protected int satiety;

    protected Animal(BaseSettings baseSettings) {
        this.baseSettings = baseSettings;
    }

    public BaseSettings getBaseSettings() {
        return baseSettings;
    }

    public abstract void eat(Location location); // 1) do we need parameter?

    public void increase(Location location) {

    }

    public  Direction chooseDirection(){
        return null;
    }

    public void increaseSatiety(int value) {
        if (value + satiety > baseSettings.getValue2()) {
            satiety = baseSettings.getValue2();
        } else {
            satiety += value;
        }
    }


}
