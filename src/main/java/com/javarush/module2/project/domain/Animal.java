package com.javarush.module2.project.domain;

public abstract class Animal {
    private final BaseSettings baseSettings;

    protected Animal(BaseSettings baseSettings) {
        this.baseSettings = baseSettings;
    }

    public abstract void eat(Location location); // 1) do we need parameter?

    public abstract void increase();  // 1)???

    public abstract Direction chooseDirection(); // 1) why not just move?
}
