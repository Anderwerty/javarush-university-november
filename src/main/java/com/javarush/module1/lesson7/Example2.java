package com.javarush.module1.lesson7;

public class Example2 {
    public static void main(String[] args) {
        String[] names = new String[3];
        names = new String[4];
        for (String name : names) {
            System.out.println(name);
        }

        names[0] = "Alex";
        names[0] = "Alex1";
        names[1] = "Oleg";
        names[2] = "Pavlo";

        for (String name : names) {
            System.out.println(name);
        }
    }
}
