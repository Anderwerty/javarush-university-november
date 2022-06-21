package com.javarush.module1.lesson7;

import java.util.Arrays;

public class Example6 {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Alex";
        names[1] = "Orest";
        names[2] = "Nazarii";

        for (String name : names) {// for in for each style
            System.out.println(name.length());
            name = "Ivan";
        }

        System.out.println(Arrays.toString(names));

        // bad style
        int counter = 0;
        for (String name : names) {
            System.out.println(name.length());
            names[counter++] = "Ivan";
        }
    }
}
