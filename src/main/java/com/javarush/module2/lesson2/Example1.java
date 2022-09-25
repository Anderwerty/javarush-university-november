package com.javarush.module2.lesson2;

public class Example1 {
    public static void main(String[] args) {
//        Animal animal = new Animal("Petryshka");
        Animal borka = new Cat("Borka");
        System.out.println(borka.getNickname());
        borka.say();

        Animal sharik = new Dog("Sharik");
        System.out.println(sharik.getNickname());
        sharik.say();

        Animal[] animals = {borka, sharik};

        for (Animal animal : animals) {
            animal.say();
        }

    }
}

class Cat extends Animal {

    public Cat(String nickname) {
        super(nickname);
    }

    @Override
    public void say() {
        System.out.println("Mia-mai");
    }
}

class Dog extends Animal {
    Dog(String nickname) {
        super(nickname);
    }

    @Override
    public void say() {
        System.out.println("Gaf-gaf");
    }
}

abstract class Animal {
    private final String nickname;

    public Animal(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public abstract void say();

    public static void staticMethod() {
        System.out.println("static method");
    }
}