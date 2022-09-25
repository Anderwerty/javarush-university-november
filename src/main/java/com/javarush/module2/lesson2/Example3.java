package com.javarush.module2.lesson2;

public class Example3 {
}

abstract class A {

    public abstract void method1();
    public abstract void method2();
}

abstract class B extends  A {

    @Override
    public void method1(){
        System.out.println("method1");
    }
}

class C extends B {

    @Override
    public void method2() {
        System.out.println("Method2");
    }
}

abstract class D extends  C {
    public abstract void method1();
}

class F extends D{

    @Override
    public void method1() {

    }
}
