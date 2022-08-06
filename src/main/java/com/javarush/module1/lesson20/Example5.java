package com.javarush.module1.lesson20;

import static com.javarush.module1.lesson20.Color.GREEN;
import static com.javarush.module1.lesson20.Color.RED;

public class Example5 {
    public static void main(String[] args) {
        Color color = null;

        if (color == RED) {
            System.out.println("Червоний");
        }
        if (color == GREEN) {
            System.out.println("Зелений");
        } else {
            System.out.println("Не колір");
        }

        System.out.println("====================");

        color = RED;
        System.out.println(processColor(color));

    }

    private static String processColor(Color color) {
        switch (color) {
            case RED:
                return "Червоний";
            case GREEN:
                return "Зелений";
            default:
                return "Не колір";
        }
    }
}

enum Color {
    RED, GREEN;
}
