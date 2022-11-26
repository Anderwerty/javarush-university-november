package com.javarush.module2.lesson17;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Example4 {
    public static void main(String[] args) throws Exception {
        Class<User> userClass = User.class;
        Constructor<User> constructor = userClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        User user = constructor.newInstance();

        Method voidMethod = userClass.getDeclaredMethod("notVoidMethod");
        voidMethod.setAccessible(true);

        Object invoke = voidMethod.invoke(user);

        System.out.println(invoke);


        Method voidStaticMethod = userClass.getDeclaredMethod("voidStaticMethod");
        voidStaticMethod.setAccessible(true);

        voidStaticMethod.invoke(null);

    }
}

class User {
    private User() {

    }

    private void voidMethod() {
        System.out.println("void private method");
    }

    private String notVoidMethod() {
        return " not void private method";
    }

    private static void voidStaticMethod() {
        System.out.println("void static private method");
    }

    private static String notVoidStaticMethod() {
        return " not void static private method";
    }
}
