package com.javarush.module2.lesson17;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.function.Function;

public class Example3 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //*** class to lambda
        Function<String, Integer> function = new Function<>() {

            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };


        Class<? extends Function> aClass = function.getClass();
        System.out.println(aClass.getName());
        Constructor<? extends Function> constructor = aClass.getDeclaredConstructor();
        Function function1 = constructor.newInstance();

        System.out.println(function == function1);
    }
}
