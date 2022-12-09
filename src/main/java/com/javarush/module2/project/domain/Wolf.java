package com.javarush.module2.project.domain;

import com.javarush.module2.project.annotation.AnimalBaseSettings;

@AnimalBaseSettings(value1 = 50, value2 = 30, value3 = 3, value4 = 8) //??
public class Wolf extends Predator {
    public Wolf() {
        super(BaseSettings.WOLF_BASE_SETTING);
    }
}
