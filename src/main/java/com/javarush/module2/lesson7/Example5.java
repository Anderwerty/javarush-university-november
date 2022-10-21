package com.javarush.module2.lesson7;

public class Example5 {
    public static void main(String[] args) {

        String product = "";
        String value = switch (product) {
            case "Apple", "Peach" -> {
                System.out.println("This is fruit");
                yield "Fruit";
            }
            default -> "Invalid product";
        };

        System.out.println(value);
    }

}
