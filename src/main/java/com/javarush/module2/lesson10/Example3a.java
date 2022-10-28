package com.javarush.module2.lesson10;

public class Example3a {
    public static void main(String[] args) {
        byte a = 127; //
        System.out.println(a);
        System.out.println(--a);
        System.out.println(--a);   // [-128, -127, ... ...., 126, 127]
    }
}
