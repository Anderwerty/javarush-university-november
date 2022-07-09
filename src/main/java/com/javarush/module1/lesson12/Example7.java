package com.javarush.module1.lesson12;

public class Example7 {
    public static void main(String[] args) {
        A b = new B();
        A c = new C();

        A[] cars = {b, c};

        for (int i = 0; i < cars.length ; i++) {
            cars[i].method();
        }

    }
}

class A {
    //

    public void method() {
        System.out.println("A");
    }
}

class B extends A {
    //

    public void method() {
        System.out.println("B");
    }
}

class C extends A {
    public void method() {
        System.out.println("C");
    }
}
