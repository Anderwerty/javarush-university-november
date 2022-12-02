package com.javarush.module2.facultative4.game;

import com.javarush.module2.facultative4.game.entity.Person;
import com.javarush.module2.facultative4.game.handler.AnnotationHandler;
import com.javarush.module2.facultative4.game.handler.ItemAnnotationHandler;

public class GameApplication {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        ItemAnnotationHandler annotationHandler = new AnnotationHandler();
        annotationHandler.handlePerson(person1, Person.class);
    }
}
