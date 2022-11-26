package com.javarush.module2.lesson17;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Example1 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton singleton1 = Singleton.getInstance();

        Singleton singleton2 = new Singleton();

        Class<Singleton> singletonClass = Singleton.class;

        Class<Integer> integerClass = int.class;
        Constructor<Singleton> constructor = singletonClass.getDeclaredConstructor(integerClass);
        int modifiers = constructor.getModifiers();
        System.out.println("modifiers: " + modifiers);

        constructor.setAccessible(true);
        Singleton singleton3 = constructor.newInstance(1);

        System.out.println(singleton1.equals(singleton2));
        System.out.println(singleton1.equals(singleton3));
        System.out.println(singleton2.equals(singleton3));
    }
}

class Singleton {

    private static volatile Singleton instance = null;

    public Singleton() {
    }

    private Singleton(int value1) {
        System.out.println("constructor with int parameter");
    }

    //... some methods

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}