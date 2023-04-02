package com.javarush.module3.lesson16_17.observer;

import java.util.HashSet;
import java.util.Set;

class Example1 {
    public static void main(String[] args) {

    }

}

public class Button implements Observable {
    private final Set<Observer> observers = new HashSet<>();

    // Map<String, Set<Observer>>

    public void click() {
        // x-> x.execute()
        // (x)-> x.execute()
        // (Observer x)-> x.execute()
        observers.forEach(Observer::execute);
        System.out.println("click");
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        observers.remove(observer);
    }
}

interface Observer {
    void execute();
}

interface Observable {
    void add(Observer observer);

    void delete(Observer observer);
}
