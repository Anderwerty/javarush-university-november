package com.javarush.module2.facultative4;

import java.util.HashMap;
import java.util.Map;

public class Example3 {
    public static void main(String[] args) {
        Person alex = new Person("Alex");
        Person boris = new Person("Boris");

        handlePerson(alex, Person.class);

    }


    private static  <T> void handlePerson(T object, Class<? extends T> clazz){
        // if annotation present
        Item annotation = clazz.getAnnotation(Item.class);
        String fileName = annotation.propertyFile();

        Map<String, String> keyToValue = new HashMap<>();
        String[] names = annotation.propertyNames();

        String value = keyToValue.get(names[0]);
        System.out.println(value);
        System.out.println(object);

    }

}


@Item(propertyFile = "items", propertyNames = {"person.name", ""})
class Person {
    private static final String IMAGE = "resource/person.jpg";

    private final String name;

    Person(String name) {
        this.name = name;
    }
}

class Warrior extends Person {

    Warrior(String name) {
        super(name);
    }
}

class Wizard extends Person {

    Wizard(String name) {
        super(name);
    }
}

@interface Item {
    String propertyFile();

    String[] propertyNames();
}