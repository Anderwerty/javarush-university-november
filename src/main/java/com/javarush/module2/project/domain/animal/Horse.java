package com.javarush.module2.project.domain.animal;

import com.javarush.module2.project.domain.BaseSettings;
import com.javarush.module2.project.domain.Direction;
import com.javarush.module2.project.domain.Location;

public class Horse extends Animal{
    protected Horse(BaseSettings baseSettings) {
        super(baseSettings);
    }

    @Override
    public void eat(Location location) {

    }

    @Override
    public void increase() {

    }

    @Override
    public Direction chooseDirection() {
        return null;
    }
}
