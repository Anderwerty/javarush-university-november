package com.javarush.module3.lesson16.decorator;

public class Main {
    public static void main(String[] args) {
//        IPizza emptyPizza = new EmptyPizza();
//        PizzaWithCheese pizzaWithCheese = new PizzaWithCheese(emptyPizza);
//        PizzaWithMeat pizzaWithCheeseAndMeat = new PizzaWithMeat(pizzaWithCheese);
//
//        PizzaWithCheese pizzaWithCheeseAndMeatAndCheese = new PizzaWithCheese(pizzaWithCheeseAndMeat);
//
//        pizzaWithCheeseAndMeatAndCheese.make();

        new PizzaWithCheese(new PizzaWithMeat(new PizzaWithCheese(new EmptyPizza()))).make();

    }
}
