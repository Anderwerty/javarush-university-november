package com.javarush.module2.facultative4.game.handler;

import com.javarush.module2.facultative4.game.annotation.Item;

import java.util.HashMap;
import java.util.Map;

public class AnnotationHandler implements ItemAnnotationHandler {

    @Override
    public <T> void handlePerson(T object, Class<? extends T> clazz) {
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
