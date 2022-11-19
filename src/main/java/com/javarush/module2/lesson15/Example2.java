package com.javarush.module2.lesson15;

public class Example2 {
    public static void main(String[] args) {
        ClassA classA = new ClassA() {
            @Override
            void method() {
                System.out.println("hi");
            }
        };
    }
}


abstract  class  ClassA {

    abstract void method();

//    void method2(){
//
//    }
}

class ClassB extends ClassA {
    @Override
    void method() {
        System.out.println("hi");
    }
}
