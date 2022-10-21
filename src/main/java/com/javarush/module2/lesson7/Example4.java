package com.javarush.module2.lesson7;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        String product = new Scanner(System.in).nextLine();
        String productType = switch (product) {
            case "Apple", "Peach" -> getFruit();
            case "Raspberry" ->
                "Berry";

            default -> "other";
        };

        System.out.println(productType);
    }

    private static String getFruit() {
        System.out.println("Fruit");
        return "Fruit";
    }
}

class A<T extends Number>{}
