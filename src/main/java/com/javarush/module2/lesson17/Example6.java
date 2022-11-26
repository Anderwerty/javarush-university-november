package com.javarush.module2.lesson17;

import java.lang.reflect.Field;
import java.util.Objects;

public class Example6 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Cat cat = new Cat("Tom");
        Class<? extends Cat> catClass = cat.getClass();
        Field nameField = catClass.getField("name");
        nameField.set(cat, "Jerry");
    }
}

class Cat {

    public Cat(String name) {
        this.name = name;
    }

    String name;

    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
