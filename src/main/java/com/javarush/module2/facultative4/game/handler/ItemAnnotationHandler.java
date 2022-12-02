package com.javarush.module2.facultative4.game.handler;

public interface ItemAnnotationHandler {
     <T> void handlePerson(T object, Class<? extends T> clazz);
}


