package com.javarush.module2.facultative1;

import java.util.function.Consumer;

public class Example3 {
    public static void main(String[] args) throws Exception {
//        A a1 = (message) -> new Example3().blabla(message);
        Consumer<String> a1 = new Example3()::blabla;

//        A a2 = (message)-> Example3.blablaStatic(message);
        A a2 = Example3::blablaStatic;
        a1.accept("hello");
        a2.method("hello");


        A aw = (message) -> {
            System.out.println("hfnfn");
            if (message != null) {
                if (message.length() > 4) {

                }
            }
        };
    }

    private void blabla(String message)  {
        System.out.println(message);
//        throw new Exception();
    }

    public static void blablaStatic(String message) {
        System.out.println(message);
//        throw new Exception();
    }
}

interface A {
    void method(String message) throws Exception;

}
