package com.javarush.module2.lesson2;

public class Example5 {
}

interface IA extends IB {
    default void method(){
        System.out.println("A");
    }
}

interface IB {
    default void method(){
        System.out.println("B");
    }
}

class MyClass implements IA, IB {

    @Override
    public void method() {
    }
}
