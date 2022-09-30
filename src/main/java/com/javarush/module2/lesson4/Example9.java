package com.javarush.module2.lesson4;

public class Example9 {
    public static void main(String[] args) {
        ClassExample9 classExample9 = new ClassExample9();
        System.out.println(classExample9 instanceof IA);
        System.out.println(classExample9 instanceof IB);
        System.out.println(classExample9 instanceof IC);

        IB ib = new IB() {
            @Override
            public void method2() {
                System.out.println("method 22222");
            }
        };
    }
}

interface IA {
    default void method1() {
        System.out.println("method - 1 super");
    }
}

interface IB {
    void method2();
}

interface IC extends IA, IB {
    void method3();
}

class ClassExample9 implements IC {

    @Override
    public void method1() {
        System.out.println("method 1");
    }

    @Override
    public void method2() {
        System.out.println("method 2");

    }

    @Override
    public void method3() {
        System.out.println("method 3");

    }
}
