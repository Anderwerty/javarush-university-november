package com.javarush.module2.facultative4;

import java.lang.annotation.Annotation;

public class Example2 {
    public static void main(String[] args) {
        System.out.println(Days.MONDAY.name());
        System.out.println(Days.MONDAY.ordinal());

        AnnotationA a = new ClassA();
        System.out.println(a.value());
    }
}

enum Days {
    MONDAY;  // static final Days MONDAY
}

@interface AnnotationA {
    int value() default 100;
}

interface InterfaceA {

}

class ClassA implements AnnotationA {

    @Override
    public Class<? extends Annotation> annotationType() {
        return AnnotationA.class;
    }

    @Override
    public int value() {
        return 0;
    }
}


