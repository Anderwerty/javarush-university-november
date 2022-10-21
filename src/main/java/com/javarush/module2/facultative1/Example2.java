package com.javarush.module2.facultative1;

import java.util.function.Consumer;
import java.util.function.Function;

public class Example2 {
    public static void main(String[] args) {
        Function<String, Integer> calculateSymbols = (input) -> input.length();

        System.out.println(calculateSymbols.apply("Hello"));



        // Function ----> Consumer
        Consumer<String> consumerPrinter = (message) -> System.out.println(message);
        Function<String, Void> functionPrinter = (message) -> {
            System.out.println(message);

            return null;
        };


        consumerPrinter.accept("consumer printer");

        System.out.println(functionPrinter.apply("function printer"));
        System.out.println(int.class.getName());
    }
}
