package com.javarush.module3.lesson16.decorator;

public class PizzaWithMeat implements IPizza {
    private final IPizza pizza;

    public PizzaWithMeat(IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void make() {
        pizza.make();
        System.out.println("meat");
    }
}
