package com.javarush.module3.lesson16.factorymethod;

public interface IExample {

    void method();
}

class A implements IExample {

    public A(){

    }

    @Override
    public void method() {
        System.out.println("A");
    }
}

class B implements IExample {

    @Override
    public void method() {
        System.out.println("B");
    }
}

class Main {
    public static void main(String[] args) {

    }


    public static IExample factoryMethod(String name) {
        switch (name) {
            case "A":
                return new A();
            case "B":
                return new B();
            default:
                throw new IllegalArgumentException();
        }
    }
}