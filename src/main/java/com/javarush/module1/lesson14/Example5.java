package com.javarush.module1.lesson14;

public class Example5 {
    public static void main(String[] args) {
        System.out.println(Dog.MAX_SIZE);
        System.out.println("=========================");

        new Dog(1);
        new Dog(2);
    }
}

class Dog {
    public static final int MAX_SIZE; // try with initialization here

    private int age;

    static {
        MAX_SIZE = 10;//?
        System.out.println("static block -1");
    }

    {
        System.out.println("non-static block -1");
    }

    {
        System.out.println("non-static block -2");
    }

    public Dog(int age) {
        System.out.println("constructor");
        this.age = age;
    }

    {
        System.out.println("non-static block -3");
    }

    static {
        System.out.println("static block -2");
    }
}
