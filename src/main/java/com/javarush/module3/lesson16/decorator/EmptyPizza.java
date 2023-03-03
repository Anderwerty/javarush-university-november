package com.javarush.module3.lesson16.decorator;

public class EmptyPizza implements IPizza{
    @Override
    public void make() {
        System.out.println("Empty pizza");
    }
}
