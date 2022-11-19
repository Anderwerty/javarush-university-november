package com.javarush.module2.lesson15;

public class Example3 {
    public static void main(String[] args) {

        //            private int value = 10;
//            @Override
//            public void method2() {
//                System.out.println(value);
//            }
        IExample3 example3 = () -> {
//                value = 100;
        };
    }
}

@FunctionalInterface  // Comparable vs Comparator
interface IExample3 {  // Don't use `I`
    void method1();

    default void method2() {

    }

}


