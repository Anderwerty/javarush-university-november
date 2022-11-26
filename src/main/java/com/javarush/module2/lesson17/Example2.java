package com.javarush.module2.lesson17;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Example2 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Color> colorClass = Color.class;

        System.out.println(colorClass.getName());
        System.out.println(colorClass.getSuperclass().getName());

        Constructor<Color> constructor = colorClass.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        Color color = constructor.newInstance("YELLOW", 2);
    }
}

enum Color {
    RED;

    Color() {
        System.out.println("enum");
    }
}
