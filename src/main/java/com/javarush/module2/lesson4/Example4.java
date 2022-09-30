package com.javarush.module2.lesson4;

public class Example4 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        InterfaceA interfaceA = myClass;
        InterfaceB interfaceB = myClass;
        InterfaceC interfaceC = myClass;

        interfaceA.methodA();
        interfaceB.methodB();
        interfaceC.methodC();
    }
}

class MyClass implements InterfaceA, InterfaceB, InterfaceC {

    @Override
    public void methodA() {

    }

    @Override
    public void methodB() {

    }

    @Override
    public void methodC() {

    }
}

class ClassA {

}

interface InterfaceA {
    void methodA();
}

interface InterfaceB {
    void methodB();
}

interface InterfaceC {
    void methodC();
}
