package com.javarush.module1.lesson20;

public class Example2 {
    public static void main(String[] args) {
        final A a1 = new A() {
            private String name = "";
            @Override
            public void method() {

                System.out.println("anonimus class");
            }
        };
        final A a2 = new A() {
            private String name = "";
            @Override
            public void method() {

                System.out.println("anonimus class");
            }
        };

        System.out.println(a1.getClass().getName());
        System.out.println(a2.getClass().getName());
        a1.method();

    }
}

class A {
    private int value;
    public void method() {
        System.out.println("a");
    }
}

class B extends A {
    @Override
    public void method() {

        System.out.println("B");
    }
}
