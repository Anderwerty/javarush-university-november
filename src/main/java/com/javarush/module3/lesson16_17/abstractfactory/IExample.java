package com.javarush.module3.lesson16_17.abstractfactory;

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
