package com.javarush.module3.lesson16_17.decorator;

public class PizzaWithCheese implements IPizza {

    private final IPizza pizza;

    public PizzaWithCheese(IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void make() {
        pizza.make();
        System.out.println("Add cheese");
    }
}
