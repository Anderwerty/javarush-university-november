package com.javarush.module2.lesson4;

public class Example8 {
    public static void main(String[] args) {
        double sin = Math.sin(3.14/2);
        System.out.println(sin);
    }
}

interface Math {
    static double sin(double a) {
        return StrictMath.sin(a);
    }
}
